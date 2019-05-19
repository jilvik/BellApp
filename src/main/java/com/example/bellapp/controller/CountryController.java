package com.example.bellapp.controller;


import com.example.bellapp.service.CountryService;
import com.example.bellapp.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;


    @PostMapping("/api/countries")
    public List<CountryView> getCoutryList() {

        return countryService.getCountries();
    }
}
