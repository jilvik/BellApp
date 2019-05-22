package com.example.bellapp.controller;


import com.example.bellapp.service.CountryService;
import com.example.bellapp.view.CountryView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "CountryController")
@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class CountryController {

    @Autowired
    private CountryService countryService;

    @ApiOperation(value = "Show list of countries", httpMethod = "POST")
    @PostMapping("/api/countries")
    public List<CountryView> getCoutryList() {

        return countryService.getCountries();
    }
}
