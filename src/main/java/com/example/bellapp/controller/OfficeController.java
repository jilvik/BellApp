package com.example.bellapp.controller;


import com.example.bellapp.dao.OfficeDao;
import com.example.bellapp.dao.OrganizationDao;
import com.example.bellapp.model.Office;
import com.example.bellapp.model.Organization;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OfficeController {

    @Autowired
    OfficeDao officeDao;

    @Autowired
    OrganizationDao organizationDao;

    @PostMapping("/api/office/list")
    public List<OfficeViewListOut> getOfficeList(@RequestBody OfficeViewListIn input) {

        Iterable<Office> allOffices = officeDao.findAll();
        List<OfficeViewListOut> list = new ArrayList<>();

        for (Office office: allOffices) {
            if (input.getOrgId().equals(office.getOrganization().getId())) {
                if (input.getName() == null  ||  input.getName().equals(office.getName())) {
                    if (input.getPhone() == null  ||  input.getPhone().equals(office.getPhone())) {
                        addOfficeToList(office, list);
                    }
                }
            }
        }

        return list;
    }

    @GetMapping("/api/office/{id}")
    public OfficeViewId getOfficeId(@PathVariable Integer id){

        Office office = officeDao.findById(id).get();
        OfficeViewId officeViewId = new OfficeViewId();

        officeViewId.setId(office.getId());
        officeViewId.setName(office.getName());
        officeViewId.setAddress(office.getAddress());
        officeViewId.setPhone(office.getPhone());
        officeViewId.setActive(office.isActive());

        return officeViewId;
    }

    @PostMapping("/api/office/update")
    public OfficeViewUpdateOut getOfficeUpdate(@RequestBody OfficeViewUpdateIn input) {

        Office office = officeDao.findById(input.getId()).get();

        office.setName(input.getName());
        office.setAddress(input.getAddress());
        office.setPhone(input.getPhone());
        office.setActive(input.isActive());

        OfficeViewUpdateOut officeViewUpdateOut = new OfficeViewUpdateOut();
        try {
            officeDao.save(office);
            officeViewUpdateOut.setResult("success");
            return officeViewUpdateOut;
        } catch (Exception e) {
            e.printStackTrace();
            officeViewUpdateOut.setResult("failure");
            return officeViewUpdateOut;
        }
    }

    @PostMapping("/api/office/save")
    public OfficeViewSaveOut getOfficeSave(@RequestBody OfficeViewSaveIn input) {

        Office office = new Office();
        Organization organization = organizationDao.findById(input.getOrgId()).get();

        office.setOrganization(organization);
        office.setName(input.getName());
        office.setAddress(input.getAddress());
        office.setPhone(input.getPhone());
        office.setActive(input.isActive());

        OfficeViewSaveOut officeViewSaveOut = new OfficeViewSaveOut();
        try {
            officeDao.save(office);
            officeViewSaveOut.setResult("success");
            return officeViewSaveOut;
        } catch (Exception e) {
            e.printStackTrace();
            officeViewSaveOut.setResult("failure");
            return officeViewSaveOut;
        }
    }

    private void addOfficeToList(Office office, List<OfficeViewListOut> list) {
        OfficeViewListOut output = new OfficeViewListOut();
        output.setId(office.getId());
        output.setName(office.getName());
        output.setActive(office.isActive());
        list.add(output);
    }

}
