package com.example.bellapp.controller;


import com.example.bellapp.dao.OrganizationDao;
import com.example.bellapp.model.Organization;
import com.example.bellapp.service.OrganizationService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationDao organizationDao;

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/api/organization/list")
    public List<OrganizationViewListOut> getOrganizationList(@RequestBody OrganizationViewListIn input) {

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

    @GetMapping("/api/organization/{id}")
    public OrganizationViewId getOrganizationId(@PathVariable Integer id) {

        Organization organization = organizationDao.findById(id).get();
        OrganizationViewId output = new OrganizationViewId();

        output.setId(organization.getId());
        output.setName(organization.getName());
        output.setFullName(organization.getFullName());
        output.setInn(organization.getInn());
        output.setKpp(organization.getKpp());
        output.setAddress(organization.getAddress());
        output.setPhone(organization.getPhone());
        output.setActive(organization.isActive());

        return output;

    }

    @PostMapping("/api/organization/update")
    public OrganizationViewUpdateOut getOrganizationUpdate(@RequestBody OrganizationViewUpdateIn input) {

        return organizationService.updateOrganization(input);

    }

    @PostMapping("/api/organization/save")
    public OrganizationViewSaveOut getOrganizationSave(@RequestBody OrganizationViewSaveIn input) {

        Organization organization = new Organization();

        //organization.setVersion(1);
        organization.setName(input.getName());
        organization.setFullName(input.getFullName());
        organization.setInn(input.getInn());
        organization.setKpp(input.getKpp());
        organization.setAddress(input.getAddress());
        organization.setPhone(input.getPhone());
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
