package com.example.bellapp.controller;


import com.example.bellapp.service.PersonService;
import com.example.bellapp.view.PersonViewId;
import com.example.bellapp.view.PersonViewListIn;
import com.example.bellapp.view.PersonViewListOut;
import com.example.bellapp.view.PersonViewSaveIn;
import com.example.bellapp.view.PersonViewSaveOut;
import com.example.bellapp.view.PersonViewUpdateIn;
import com.example.bellapp.view.PersonViewUpdateOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "OfficeController")
@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class PersonController {

    @Autowired
    private PersonService personService;


    @ApiOperation(value = "Search persons by request body", httpMethod = "POST")
    @PostMapping(value = "/api/person/list", consumes = APPLICATION_JSON_VALUE)
    public List<PersonViewListOut> getPersonList(@RequestBody PersonViewListIn input) {

        return personService.findPersons(input);
    }

    @ApiOperation(value = "Search person by ID", httpMethod = "GET")
    @GetMapping("/api/person/{id}")
    public PersonViewId getPersonId(@PathVariable Integer id) {

        return personService.getPerson(id);
    }

    @ApiOperation(value = "Update person", httpMethod = "POST")
    @PostMapping(value = "/api/person/update", consumes = APPLICATION_JSON_VALUE)
    public PersonViewUpdateOut getPersonUpdate(@RequestBody PersonViewUpdateIn input) {

        return personService.updatePerson(input);
    }

    @ApiOperation(value = "Create new person", httpMethod = "POST")
    @PostMapping(value = "/api/person/save", consumes = APPLICATION_JSON_VALUE)
    public PersonViewSaveOut getPersonSave(@RequestBody PersonViewSaveIn input) {

        return personService.savePerson(input);
    }
}
