package com.example.bellapp.dao;

import com.example.bellapp.model.DocType;
import org.springframework.data.repository.CrudRepository;

public interface DocTypeDao extends CrudRepository<DocType, Integer> {
    DocType findByCode(String code);
    DocType findByName(String name);
}
