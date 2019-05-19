package com.example.bellapp.controller;


import com.example.bellapp.service.OrganizationService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;


    @PostMapping("/api/organization/list")
    public List<OrganizationViewListOut> getOrganizationList(@RequestBody OrganizationViewListIn input) {

        return organizationService.findOrganizations(input);
    }

    @GetMapping("/api/organization/{id}")
    public OrganizationViewId getOrganizationId(@PathVariable Integer id) {

        return organizationService.getOrganization(id);
    }

    @PostMapping("/api/organization/update")
    public OrganizationViewUpdateOut getOrganizationUpdate(@RequestBody OrganizationViewUpdateIn input) {

        return organizationService.updateOrganization(input);
    }

    @PostMapping("/api/organization/save")
    public OrganizationViewSaveOut getOrganizationSave(@RequestBody OrganizationViewSaveIn input) {

        return organizationService.saveOrganization(input);
    }
}
