package com.example.bellapp.controller;


import com.example.bellapp.service.OrganizationService;
import com.example.bellapp.view.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "OrganizationController")
@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;


    @ApiOperation(value = "Search organizations by request body", httpMethod = "POST")
    @PostMapping(value = "/api/organization/list", consumes = APPLICATION_JSON_VALUE)
    public List<OrganizationViewListOut> getOrganizationList(@RequestBody OrganizationViewListIn input) {

        return organizationService.findOrganizations(input);
    }

    @ApiOperation(value = "Search organization by ID", httpMethod = "GET")
    @GetMapping("/api/organization/{id}")
    public OrganizationViewId getOrganizationId(@PathVariable Integer id) {

        return organizationService.getOrganization(id);
    }

    @ApiOperation(value = "Update organization", httpMethod = "POST")
    @PostMapping(value = "/api/organization/update", consumes = APPLICATION_JSON_VALUE)
    public OrganizationViewUpdateOut getOrganizationUpdate(@RequestBody OrganizationViewUpdateIn input) {

        return organizationService.updateOrganization(input);
    }

    @ApiOperation(value = "Create new organization", httpMethod = "POST")
    @PostMapping(value = "/api/organization/save", consumes = APPLICATION_JSON_VALUE)
    public OrganizationViewSaveOut getOrganizationSave(@RequestBody OrganizationViewSaveIn input) {

        return organizationService.saveOrganization(input);
    }
}
