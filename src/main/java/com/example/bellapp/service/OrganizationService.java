package com.example.bellapp.service;

import com.example.bellapp.dao.OrganizationDao;
import com.example.bellapp.model.Organization;
import com.example.bellapp.view.OrganizationViewUpdateIn;
import com.example.bellapp.view.OrganizationViewUpdateOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrganizationService implements OrganizationServiceInterface {

    @Autowired
    private OrganizationDao organizationDao;

    @Transactional
    public OrganizationViewUpdateOut updateOrganization(OrganizationViewUpdateIn input) {
        Organization organization = organizationDao.findById(input.getId()).get();

        organization.setName(input.getName());
        organization.setFullName(input.getFullName());
        organization.setInn(input.getInn());
        organization.setKpp(input.getKpp());
        organization.setAddress(input.getAddress());
        organization.setPhone(input.getPhone());
        organization.setActive(input.isActive());

        OrganizationViewUpdateOut output = new OrganizationViewUpdateOut();
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
}
