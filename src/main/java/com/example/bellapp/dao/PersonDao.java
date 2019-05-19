package com.example.bellapp.dao;

import com.example.bellapp.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Integer> {

}
