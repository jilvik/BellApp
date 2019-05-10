package com.example.bellapp.controller;


import com.example.bellapp.view.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class PersonController {

    @PostMapping("/api/person/list")
    public List<PersonViewListOut> getPersonList(@RequestBody PersonViewListIn input) {

        PersonViewListIn personViewList = new PersonViewListIn();

        personViewList.setOfficeId(1);
        personViewList.setLastName("testLastName");
        personViewList.setFirstName("testFirstName");
        personViewList.setMiddleName("testMiddleName");
        personViewList.setPost("testPost");
        personViewList.setDocCode("testDocCode");
        personViewList.setCountryCode("testCountryCode");

        PersonViewListOut personViewListOut = new PersonViewListOut();

        personViewListOut.setId(5);
        personViewListOut.setLastName("testOutLastName");
        personViewListOut.setFirstName("testOutFirstName");
        personViewListOut.setMiddleName("testOutMiddleName");
        personViewListOut.setPost("testOutPost");

        return Arrays.asList(personViewListOut);
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
    public PersonViewUpdateOut getPersonUpdate(@RequestBody PersonViewUpdateIn input) {

        PersonViewUpdateIn personViewUpdate = new PersonViewUpdateIn();

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

        PersonViewUpdateOut personViewUpdateOut = new PersonViewUpdateOut();
        personViewUpdateOut.setResult("success");

        return personViewUpdateOut;
    }

    @PostMapping("/api/person/save")
    public PersonViewSaveOut getPersonSave(@RequestBody PersonViewSaveIn input) {

        PersonViewSaveIn personViewSave = new PersonViewSaveIn();

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

        PersonViewSaveOut personViewSaveOut = new PersonViewSaveOut();
        personViewSaveOut.setResult("success");

        return personViewSaveOut;
    }

}
