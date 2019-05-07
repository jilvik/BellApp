package com.example.bellapp.controller;


import com.example.bellapp.view.PersonViewId;
import com.example.bellapp.view.PersonViewList;
import com.example.bellapp.view.PersonViewSave;
import com.example.bellapp.view.PersonViewUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class PersonController {

    @PostMapping("/api/person/list")
    public List<PersonViewList> getPersonList(@RequestBody PersonViewList query) {

        PersonViewList personViewList = new PersonViewList();

        personViewList.setOfficeId(1);
        personViewList.setLastName("testLastName");
        personViewList.setFirstName("testFirstName");
        personViewList.setMiddleName("testMiddleName");
        personViewList.setPost("testPost");
        personViewList.setDocCode("testDocCode");
        personViewList.setCountryCode("testCountryCode");

        return Arrays.asList(personViewList);
    }

    @GetMapping("/api/person/{id}")
    public PersonViewId getPersonId(@PathVariable Integer id) {

        PersonViewId personViewId = new PersonViewId();

        personViewId.setId(1);
        personViewId.setLastName("testLastName");
        personViewId.setFirstName("testFirstName");
        personViewId.setMiddleName("testMiddleName");
        personViewId.setPost("testPost");
        personViewId.setPhone("testPhone");
        personViewId.setDocName("testDocName");
        personViewId.setDocumentNumber("testDocumentNumber");
        personViewId.setDocumentDate(new Date(2012, 10, 18));

        return personViewId;
    }

    @PostMapping("/api/person/update")
    public String getPersonUpdate(@RequestBody PersonViewUpdate query) {

        PersonViewUpdate personViewUpdate = new PersonViewUpdate();

        personViewUpdate.setId(6);
        personViewUpdate.setOfficeId(4);
        personViewUpdate.setFirstName("testFirstName");
        personViewUpdate.setLastName("testLastName");
        personViewUpdate.setMiddleName("testMiddleName");
        personViewUpdate.setPost("testPost");
        personViewUpdate.setPhone("testPhone");
        personViewUpdate.setDocName("testDocName");
        personViewUpdate.setDocumentNumber("testDocNumber");
        personViewUpdate.setDocumentDate(new Date(2001, 12, 1));
        personViewUpdate.setCountryCode("testCountryCode");
        personViewUpdate.setIdentified(true);

        return "success";
    }

    @PostMapping("/api/person/save")
    public String getPersonSave(@RequestBody PersonViewSave query) {

        PersonViewSave personViewSave = new PersonViewSave();

        personViewSave.setOfficeId(7);
        personViewSave.setFirstName("testFirstName");
        personViewSave.setLastName("testLastName");
        personViewSave.setMiddleName("testMiddleName");
        personViewSave.setPost("testPost");
        personViewSave.setPhone("testPhone");
        personViewSave.setDocCode("testDocCode");
        personViewSave.setDocName("testDocName");
        personViewSave.setDocumentNumber("testDocNumber");
        personViewSave.setDocumentDate(new Date(1999, 12, 9));

        return "success";
    }

}
