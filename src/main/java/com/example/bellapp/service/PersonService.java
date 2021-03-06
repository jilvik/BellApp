package com.example.bellapp.service;

import com.example.bellapp.dao.CountryDao;
import com.example.bellapp.dao.DocTypeDao;
import com.example.bellapp.dao.DocumentDao;
import com.example.bellapp.dao.OfficeDao;
import com.example.bellapp.dao.PersonDao;
import com.example.bellapp.model.Country;
import com.example.bellapp.model.DocType;
import com.example.bellapp.model.Document;
import com.example.bellapp.model.Office;
import com.example.bellapp.model.Person;
import com.example.bellapp.view.PersonViewId;
import com.example.bellapp.view.PersonViewListIn;
import com.example.bellapp.view.PersonViewListOut;
import com.example.bellapp.view.PersonViewSaveIn;
import com.example.bellapp.view.PersonViewSaveOut;
import com.example.bellapp.view.PersonViewUpdateIn;
import com.example.bellapp.view.PersonViewUpdateOut;
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

        optionalPerson.ifPresent(person -> {
            if (input.getOfficeId() != null) {
                Optional<Office> optionalOffice = officeDao.findById(input.getOfficeId());
                optionalOffice.ifPresent(office -> person.setOffice(optionalOffice.get()));
            }
            setInitialsToPerson(input.getLastName(), input.getFirstName(), input.getMiddleName(), person);
            person.setPost(input.getPost());
            if (input.getPhone() != null) {
                person.setPhone(input.getPhone());
            }

            setDocumentToPerson(person, input);

            Country country = countryDao.findByCode(input.getCountryCode());
            person.setCountry(country);

            person.setIdentified(input.isIdentified());
        });

        PersonViewUpdateOut output = new PersonViewUpdateOut();
        try {
            optionalPerson.ifPresent(person -> {
                if (person.getDocument() != null) {
                    documentDao.save(person.getDocument());
                }
                personDao.save(person);
            });
            output.setResult("success");
            return output;
        } catch (Exception e) {
            throw new RuntimeException("FAILURE: " + e.getMessage(), e);
        }
    }

    @Override
    public PersonViewSaveOut savePerson(PersonViewSaveIn input) {

        Person person = new Person();
        Optional<Office> optional = officeDao.findById(input.getOfficeId());
        optional.ifPresent(office -> person.setOffice(optional.get()));
        setInitialsToPerson(input.getLastName(), input.getFirstName(), input.getMiddleName(), person);
        person.setPost(input.getPost());
        if (input.getPhone() != null) {
            person.setPhone(input.getPhone());
        }

        setDocumentToPerson(person, input);

        Country country = countryDao.findByCode(input.getCountryCode());
        person.setCountry(country);

        person.setIdentified(input.isIdentified());

        PersonViewSaveOut output = new PersonViewSaveOut();
        try {
            if (person.getDocument() != null) {
                documentDao.save(person.getDocument());
            }
            personDao.save(person);
            output.setResult("success");
            return output;
        } catch (Exception e) {
            throw new RuntimeException("FAILURE: " + e.getMessage(), e);
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

    private void setInitialsToPerson(String lastName, String firstName, String middleName, Person person) {

        if (lastName != null) {
            person.setLastName(lastName);
        }

        person.setFirstName(firstName);

        if (middleName != null) {
            person.setMiddleName(middleName);
        }
    }

    private void setDocumentToPerson(Person person, PersonViewSaveIn input) {

        if (input.getDocName() != null  ||  input.getDocCode() != null  ||
                input.getDocumentNumber() != null  ||  input.getDocumentDate() != null) {

            Document document = new Document();

            if (input.getDocCode() != null) {
                DocType docType = docTypeDao.findByCode(input.getDocCode());
                document.setDocType(docType);
            } else {
                if (input.getDocName() != null) {
                    DocType docType = docTypeDao.findByName(input.getDocName());
                    document.setDocType(docType);
                }
            }
            document.setNumber(input.getDocumentNumber());
            document.setIssueDate(input.getDocumentDate());
            person.setDocument(document);
        }
    }

    private void setDocumentToPerson(Person person, PersonViewUpdateIn input) {

        if (input.getDocName() != null  ||  input.getDocumentNumber() != null  ||
                input.getDocumentDate() != null) {
            Document document;
            document = person.getDocument() == null  ?  new Document()  :  person.getDocument();

            if (input.getDocName() != null) {
                DocType docType = docTypeDao.findByName(input.getDocName());
                document.setDocType(docType);
            }
            if (input.getDocumentNumber() != null) {
                document.setNumber(input.getDocumentNumber());
            }
            if (input.getDocumentDate() != null) {
                document.setIssueDate(input.getDocumentDate());
            }

            person.setDocument(document);
        }

    }
}
