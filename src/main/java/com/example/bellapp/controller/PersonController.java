package com.example.bellapp.controller;


import com.example.bellapp.service.PersonService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping(value = "/api/person/list", consumes = APPLICATION_JSON_VALUE)
    public List<PersonViewListOut> getPersonList(@RequestBody PersonViewListIn input) {

        return personService.findPersons(input);
    }

    @GetMapping("/api/person/{id}")
    public PersonViewId getPersonId(@PathVariable Integer id) {

        return personService.getPerson(id);
    }

    @PostMapping(value = "/api/person/update", consumes = APPLICATION_JSON_VALUE)
    public PersonViewUpdateOut getPersonUpdate(@RequestBody PersonViewUpdateIn input) {

        return personService.updatePerson(input);
    }

    @PostMapping(value = "/api/person/save", consumes = APPLICATION_JSON_VALUE)
    public PersonViewSaveOut getPersonSave(@RequestBody PersonViewSaveIn input) {

        return personService.savePerson(input);
    }
}
