package com.example.bellapp.controller;


import com.example.bellapp.view.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrganizationController {

    @PostMapping("/api/organization/list")
    public List<OrganizationViewListOut> getOrganizationList(@RequestBody OrganizationViewListIn input) {
//TODO: add todo
        OrganizationViewListIn organizationViewList = new OrganizationViewListIn();

        organizationViewList.setName("testName");
        organizationViewList.setInn("testInn");
        organizationViewList.setActive(true);

        OrganizationViewListOut organizationViewListOut = new OrganizationViewListOut();

        organizationViewListOut.setId(1);
        organizationViewListOut.setName("testOutName");
        organizationViewListOut.setActive(true);

        return Arrays.asList(organizationViewListOut);
    }

    @GetMapping("/api/organization/{id}")
    public OrganizationViewId getOrganizationId(@PathVariable Integer id) {

        OrganizationViewId organizationViewId = new OrganizationViewId();

        organizationViewId.setId(12);
        organizationViewId.setName("testName");
        organizationViewId.setFullName("testFullName");
        organizationViewId.setInn("testInn");
        organizationViewId.setKpp("testKpp");
        organizationViewId.setAddress("testAddress");
        organizationViewId.setPhone("testPhone");
        organizationViewId.setActive(true);

        return organizationViewId;

    }

    @PostMapping("/api/organization/update")
    public OrganizationViewUpdateOut getOrganizationUpdate(@RequestBody OrganizationViewUpdateIn input) {

        OrganizationViewUpdateIn organizationViewUpdate = new OrganizationViewUpdateIn();

        organizationViewUpdate.setId(2);
        organizationViewUpdate.setName("testName");
        organizationViewUpdate.setFullName("testFullName");
        organizationViewUpdate.setInn("testInn");
        organizationViewUpdate.setKpp("testKpp");
        organizationViewUpdate.setAddress("testAddress");
        organizationViewUpdate.setPhone("testPhone");
        organizationViewUpdate.setActive(true);

        OrganizationViewUpdateOut organizationViewUpdateOut = new OrganizationViewUpdateOut();
        organizationViewUpdateOut.setResult("success");

        return organizationViewUpdateOut;
    }

    @PostMapping("/api/organization/save")
    public OrganizationViewSaveOut getOrganizationSave(@RequestBody OrganizationViewSaveIn input) {

        OrganizationViewSaveIn organizationViewSave = new OrganizationViewSaveIn();

        organizationViewSave.setName("testName");
        organizationViewSave.setFullName("testFullName");
        organizationViewSave.setInn("testInn");
        organizationViewSave.setKpp("testKpp");
        organizationViewSave.setAddress("testAddress");
        organizationViewSave.setPhone("testPhone");
        organizationViewSave.setActive(true);
//Conttoller ->DAO
        OrganizationViewSaveOut organizationViewSaveOut = new OrganizationViewSaveOut();
        organizationViewSaveOut.setResult("success");

        return organizationViewSaveOut;
    }

}
