package com.example.bellapp.controller;


import com.example.bellapp.service.OfficeService;
import com.example.bellapp.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    @Autowired
    private OfficeService officeService;


    @PostMapping(value = "/api/office/list", consumes = APPLICATION_JSON_VALUE)
    public List<OfficeViewListOut> getOfficeList(@RequestBody OfficeViewListIn input) {

        return officeService.findOffices(input);
    }

    @GetMapping("/api/office/{id}")
    public OfficeViewId getOfficeId(@PathVariable Integer id){

        return officeService.getOffice(id);
    }

    @PostMapping(value = "/api/office/update", consumes = APPLICATION_JSON_VALUE)
    public OfficeViewUpdateOut getOfficeUpdate(@RequestBody OfficeViewUpdateIn input) {

        return officeService.updateOffice(input);
    }

    @PostMapping(value = "/api/office/save", consumes = APPLICATION_JSON_VALUE)
    public OfficeViewSaveOut getOfficeSave(@RequestBody OfficeViewSaveIn input) {

        return officeService.saveOffice(input);
    }
}
