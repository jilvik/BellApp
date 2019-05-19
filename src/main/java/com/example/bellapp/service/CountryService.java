package com.example.bellapp.service;

import com.example.bellapp.dao.CountryDao;
import com.example.bellapp.model.Country;
import com.example.bellapp.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService implements CountryServiceInterface {

    @Autowired
    private CountryDao countryDao;


    @Override
    public List<CountryView> getCountries() {

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
