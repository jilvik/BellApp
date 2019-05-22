package com.example.bellapp.controller;


import com.example.bellapp.service.OrganizationService;
import com.example.bellapp.view.OrganizationViewId;
import com.example.bellapp.view.OrganizationViewListIn;
import com.example.bellapp.view.OrganizationViewListOut;
import com.example.bellapp.view.OrganizationViewSaveIn;
import com.example.bellapp.view.OrganizationViewSaveOut;
import com.example.bellapp.view.OrganizationViewUpdateIn;
import com.example.bellapp.view.OrganizationViewUpdateOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
