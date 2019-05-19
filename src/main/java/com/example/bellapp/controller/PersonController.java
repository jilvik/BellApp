package com.example.bellapp.controller;


import com.example.bellapp.service.PersonService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping("/api/person/list")
    public List<PersonViewListOut> getPersonList(@RequestBody PersonViewListIn input) {

        return personService.findPersons(input);
    }

    @GetMapping("/api/person/{id}")
    public PersonViewId getPersonId(@PathVariable Integer id) {

        return personService.getPerson(id);
    }

    @PostMapping("/api/person/update")
    public PersonViewUpdateOut getPersonUpdate(@RequestBody PersonViewUpdateIn input) {

        return personService.updatePerson(input);
    }

    @PostMapping("/api/person/save")
    public PersonViewSaveOut getPersonSave(@RequestBody PersonViewSaveIn input) {

        return personService.savePerson(input);
    }
}
