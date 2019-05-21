package com.example.bellapp.service;

import com.example.bellapp.dao.OrganizationDao;
import com.example.bellapp.model.Organization;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService implements OrganizationServiceInterface {

    @Autowired
    private OrganizationDao organizationDao;


    @Override
    public List<OrganizationViewListOut> findOrganizations(OrganizationViewListIn input) {

        Iterable<Organization> allOrganizations = organizationDao.findAll();
        List<OrganizationViewListOut> list = new ArrayList<>();

        for (Organization organization: allOrganizations) {
            if (input.getName().equals(organization.getName())) {
                if (input.getInn() == null  ||  input.getInn().equals(organization.getInn())) {
                    addOrganizationToList(organization, list);
                }
            }
        }

        return list;
    }

    @Override
    public OrganizationViewId getOrganization(Integer id) {

        OrganizationViewId output = new OrganizationViewId();
        Optional<Organization> optional = organizationDao.findById(id);
        optional.ifPresent(organization -> {
            output.setId(organization.getId());
            output.setName(organization.getName());
            output.setFullName(organization.getFullName());
            output.setInn(organization.getInn());
            output.setKpp(organization.getKpp());
            output.setAddress(organization.getAddress());
            output.setPhone(organization.getPhone());
            output.setActive(organization.isActive());
        });

        return output;
    }

    @Transactional
    @Override
    public OrganizationViewUpdateOut updateOrganization(OrganizationViewUpdateIn input) {

        Optional<Organization> optional = organizationDao.findById(input.getId());
        optional.ifPresent(organization -> {
            organization.setName(input.getName());
            organization.setFullName(input.getFullName());
            organization.setInn(input.getInn());
            organization.setKpp(input.getKpp());
            organization.setAddress(input.getAddress());

            if (input.getPhone() != null) {
                organization.setPhone(input.getPhone());
            }
            organization.setActive(input.isActive());
        });

        OrganizationViewUpdateOut output = new OrganizationViewUpdateOut();
        try {
            optional.ifPresent(organization -> organizationDao.save(organization));
            output.setResult("success");
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            output.setResult("failure");
            return output;
        }
    }

    @Override
    public OrganizationViewSaveOut saveOrganization(OrganizationViewSaveIn input) {

        Organization organization = new Organization();

        organization.setName(input.getName());
        organization.setFullName(input.getFullName());
        organization.setInn(input.getInn());
        organization.setKpp(input.getKpp());
        organization.setAddress(input.getAddress());

        if (input.getPhone() != null) {
            organization.setPhone(input.getPhone());
        }
        organization.setActive(input.isActive());

        OrganizationViewSaveOut output = new OrganizationViewSaveOut();
        try {
            organizationDao.save(organization);
            output.setResult("success");
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            output.setResult("failure");
            return output;
        }
    }

    private void addOrganizationToList(Organization organization, List<OrganizationViewListOut> list) {

        OrganizationViewListOut output = new OrganizationViewListOut();
        output.setId(organization.getId());
        output.setName(organization.getName());
        output.setActive(organization.isActive());
        list.add(output);
    }
}
