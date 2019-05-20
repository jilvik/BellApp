package com.example.bellapp.controller;


import com.example.bellapp.service.CountryService;
import com.example.bellapp.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class CountryController {

    @Autowired
    private CountryService countryService;


    @PostMapping("/api/countries")
    public List<CountryView> getCoutryList() {

        return countryService.getCountries();
    }
}
