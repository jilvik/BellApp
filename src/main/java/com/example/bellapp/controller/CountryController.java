package com.example.bellapp.controller;


import com.example.bellapp.dao.CountryDao;
import com.example.bellapp.model.Country;
import com.example.bellapp.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryDao countryDao;

    @PostMapping("/api/countries")
    public List<CountryView> getCoutryList() {

        Iterable<Country> allCountries = countryDao.findAll();
        List<CountryView> countryList = new ArrayList<>();

        for (Country country: allCountries) {
            CountryView output = new CountryView();
            output.setName(country.getName());
            output.setCode(country.getCode());
            countryList.add(output);
        }

        return countryList;
    }
}
