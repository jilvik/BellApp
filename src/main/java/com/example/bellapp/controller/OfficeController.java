package com.example.bellapp.controller;


import com.example.bellapp.service.OfficeService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfficeController {

    @Autowired
    private OfficeService officeService;


    @PostMapping("/api/office/list")
    public List<OfficeViewListOut> getOfficeList(@RequestBody OfficeViewListIn input) {

        return officeService.findOffices(input);
    }

    @GetMapping("/api/office/{id}")
    public OfficeViewId getOfficeId(@PathVariable Integer id){

        return officeService.getOffice(id);
    }

    @PostMapping("/api/office/update")
    public OfficeViewUpdateOut getOfficeUpdate(@RequestBody OfficeViewUpdateIn input) {

        return officeService.updateOffice(input);
    }

    @PostMapping("/api/office/save")
    public OfficeViewSaveOut getOfficeSave(@RequestBody OfficeViewSaveIn input) {

        return officeService.saveOffice(input);
    }
}
