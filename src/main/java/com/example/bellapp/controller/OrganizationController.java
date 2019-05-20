package com.example.bellapp.controller;


import com.example.bellapp.service.OrganizationService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;


    @PostMapping(value = "/api/organization/list", consumes = APPLICATION_JSON_VALUE)
    public List<OrganizationViewListOut> getOrganizationList(@RequestBody OrganizationViewListIn input) {

        return organizationService.findOrganizations(input);
    }

    @GetMapping("/api/organization/{id}")
    public OrganizationViewId getOrganizationId(@PathVariable Integer id) {

        return organizationService.getOrganization(id);
    }

    @PostMapping(value = "/api/organization/update", consumes = APPLICATION_JSON_VALUE)
    public OrganizationViewUpdateOut getOrganizationUpdate(@RequestBody OrganizationViewUpdateIn input) {

        return organizationService.updateOrganization(input);
    }

    @PostMapping(value = "/api/organization/save", consumes = APPLICATION_JSON_VALUE)
    public OrganizationViewSaveOut getOrganizationSave(@RequestBody OrganizationViewSaveIn input) {

        return organizationService.saveOrganization(input);
    }
}
