package com.example.bellapp.dao;

import com.example.bellapp.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryDao extends CrudRepository<Country, Integer> {
    Country findByCode(String code);
}
