package com.example.bellapp.dao;

import com.example.bellapp.model.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationDao extends CrudRepository<Organization, Integer> {

}
