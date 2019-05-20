package com.example.bellapp.service;

import com.example.bellapp.dao.*;
import com.example.bellapp.model.*;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements PersonServiceInterface {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private OfficeDao officeDao;

    @Autowired
    private DocumentDao documentDao;

    @Autowired
    private DocTypeDao docTypeDao;

    @Autowired
    private CountryDao countryDao;


    @Override
    public List<PersonViewListOut> findPersons(PersonViewListIn input) {

        Iterable<Person> allPersons = personDao.findAll();
        List<PersonViewListOut> list = new ArrayList<>();

        for (Person person: allPersons) {
            if (person.getOffice().getId() == input.getOfficeId()) {
                if (input.getLastName() == null  ||  person.getLastName().equals(input.getLastName())) {
                    if (input.getFirstName() == null  ||  person.getFirstName().equals(input.getFirstName())) {
                        if (input.getMiddleName() == null  ||  person.getMiddleName().equals(input.getMiddleName())) {
                            if (input.getPost() == null  ||  person.getPost().equals(input.getPost())) {
                                if (input.getDocCode() == null  ||  person.getDocument().getDocType().getCode().equals(input.getDocCode())) {
                                    if (input.getCountryCode() == null  ||  person.getCountry().getCode().equals(input.getCountryCode())) {
                                        addPersonToList(person, list);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return list;
    }

    @Override
    public PersonViewId getPerson(Integer id) {

        PersonViewId personViewId = new PersonViewId();
        Optional<Person> optional = personDao.findById(id);
        optional.ifPresent(person -> {
            personViewId.setId(person.getId());
            personViewId.setLastName(person.getLastName());
            personViewId.setFirstName(person.getFirstName());
            personViewId.setMiddleName(person.getMiddleName());
            personViewId.setPost(person.getPost());
            personViewId.setPhone(person.getPhone());
            personViewId.setDocName(person.getDocument().getDocType().getName());
            personViewId.setDocumentNumber(person.getDocument().getNumber());
            personViewId.setDocumentDate(person.getDocument().getIssueDate());
            personViewId.setCountryName(person.getCountry().getName());
            personViewId.setCountryCode(person.getCountry().getCode());
            personViewId.setIdentified(person.isIdentified());
        });

        return personViewId;
    }

    @Override
    public PersonViewUpdateOut updatePerson(PersonViewUpdateIn input) {

        Optional<Person> optionalPerson = personDao.findById(input.getId());
        Optional<Office> optionalOffice = officeDao.findById(input.getOfficeId());
        optionalPerson.ifPresent(person -> {
            optionalOffice.ifPresent(office -> person.setOffice(optionalOffice.get()));
            person.setLastName(input.getLastName());
            person.setFirstName(input.getFirstName());
            person.setMiddleName(input.getMiddleName());
            person.setPost(input.getPost());
            person.setPhone(input.getPhone());
        });

        Document document = new Document();
        DocType docType = docTypeDao.findByName(input.getDocName());
        if (docType.getName().equals(input.getDocName())) {
            document.setDocType(docType);
        }

        document.setNumber(input.getDocumentNumber());
        document.setIssueDate(input.getDocumentDate());
        optionalPerson.ifPresent(person -> person.setDocument(document));

        Country country = countryDao.findByCode(input.getCountryCode());
        optionalPerson.ifPresent(person -> person.setCountry(country));

        optionalPerson.ifPresent(person -> person.setIdentified(input.isIdentified()));

        PersonViewUpdateOut output = new PersonViewUpdateOut();
        try {
            documentDao.save(document);
            optionalPerson.ifPresent(person -> personDao.save(person));
            output.setResult("success");
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            output.setResult("failure");
            return output;
        }
    }

    @Override
    public PersonViewSaveOut savePerson(PersonViewSaveIn input) {

        Person person = new Person();
        Optional<Office> optional = officeDao.findById(input.getOfficeId());
        optional.ifPresent(office -> person.setOffice(optional.get()));

        person.setLastName(input.getLastName());
        person.setFirstName(input.getFirstName());
        person.setMiddleName(input.getMiddleName());
        person.setPost(input.getPost());
        person.setPhone(input.getPhone());

        Document document = new Document();
        DocType docType = docTypeDao.findByCode(input.getDocCode());
        if (docType.getCode().equals(input.getDocCode())) {
            document.setDocType(docType);
        }

        document.setNumber(input.getDocumentNumber());
        document.setIssueDate(input.getDocumentDate());
        person.setDocument(document);

        Country country = countryDao.findByCode(input.getCountryCode());
        person.setCountry(country);

        person.setIdentified(input.isIdentified());

        PersonViewSaveOut output = new PersonViewSaveOut();
        try {
            documentDao.save(document);
            personDao.save(person);
            output.setResult("success");
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            output.setResult("failure");
            return output;
        }
    }

    private void addPersonToList(Person person, List<PersonViewListOut> list) {
        PersonViewListOut output = new PersonViewListOut();
        output.setId(person.getId());
        output.setLastName(person.getLastName());
        output.setFirstName(person.getFirstName());
        output.setMiddleName(person.getMiddleName());
        output.setPost(person.getPost());
        list.add(output);
    }
}
