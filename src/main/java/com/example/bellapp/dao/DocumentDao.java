package com.example.bellapp.dao;

import com.example.bellapp.model.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentDao extends CrudRepository<Document, Integer> {

}
