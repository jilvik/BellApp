package com.example.bellapp.controller;


import com.example.bellapp.view.OrganizationViewId;
import com.example.bellapp.view.OrganizationViewList;
import com.example.bellapp.view.OrganizationViewSave;
import com.example.bellapp.view.OrganizationViewUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrganizationController {

    @PostMapping("/api/organization/list")
    public List<OrganizationViewList> getOrganizationList(@RequestBody OrganizationViewList query) {

        OrganizationViewList organizationViewList = new OrganizationViewList();

        organizationViewList.setId(1);
        organizationViewList.setName("testName");
        organizationViewList.setInn("testInn");
        organizationViewList.setActive(true);

        return Arrays.asList(organizationViewList);
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
    public String getOrganizationUpdate(@RequestBody OrganizationViewUpdate query) {

        OrganizationViewUpdate organizationViewUpdate = new OrganizationViewUpdate();

        organizationViewUpdate.setId(2);
        organizationViewUpdate.setName("testName");
        organizationViewUpdate.setFullName("testFullName");
        organizationViewUpdate.setInn("testInn");
        organizationViewUpdate.setKpp("testKpp");
        organizationViewUpdate.setAddress("testAddress");
        organizationViewUpdate.setPhone("testPhone");
        organizationViewUpdate.setActive(true);

        return "success";
    }

    @PostMapping("/api/organization/save")
    public String getOrganizationSave(@RequestBody OrganizationViewSave query) {

        OrganizationViewSave organizationViewSave = new OrganizationViewSave();

        organizationViewSave.setName("testName");
        organizationViewSave.setFullName("testFullName");
        organizationViewSave.setInn("testInn");
        organizationViewSave.setKpp("testKpp");
        organizationViewSave.setAddress("testAddress");
        organizationViewSave.setPhone("testPhone");
        organizationViewSave.setActive(true);

        return "success";
    }

}
