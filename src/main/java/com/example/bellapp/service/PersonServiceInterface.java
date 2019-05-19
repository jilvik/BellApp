package com.example.bellapp.service;

import com.example.bellapp.view.*;

import java.util.List;

public interface PersonServiceInterface {

    List<PersonViewListOut> findPersons(PersonViewListIn input);

    PersonViewId getPerson(Integer id);

    PersonViewUpdateOut updatePerson(PersonViewUpdateIn input);

    PersonViewSaveOut savePerson(PersonViewSaveIn input);
}
