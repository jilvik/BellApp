package com.example.bellapp.controller;


import com.example.bellapp.service.OfficeService;
import com.example.bellapp.view.OfficeViewId;
import com.example.bellapp.view.OfficeViewListIn;
import com.example.bellapp.view.OfficeViewListOut;
import com.example.bellapp.view.OfficeViewSaveIn;
import com.example.bellapp.view.OfficeViewSaveOut;
import com.example.bellapp.view.OfficeViewUpdateIn;
import com.example.bellapp.view.OfficeViewUpdateOut;
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

@Api(value = "OfficeController")
@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    @Autowired
    private OfficeService officeService;


    @ApiOperation(value = "Search offices by request body", httpMethod = "POST")
    @PostMapping(value = "/api/office/list", consumes = APPLICATION_JSON_VALUE)
    public List<OfficeViewListOut> getOfficeList(@RequestBody OfficeViewListIn input) {

        return officeService.findOffices(input);
    }

    @ApiOperation(value = "Search office by ID", httpMethod = "GET")
    @GetMapping("/api/office/{id}")
    public OfficeViewId getOfficeId(@PathVariable Integer id){

        return officeService.getOffice(id);
    }

    @ApiOperation(value = "Update office", httpMethod = "POST")
    @PostMapping(value = "/api/office/update", consumes = APPLICATION_JSON_VALUE)
    public OfficeViewUpdateOut getOfficeUpdate(@RequestBody OfficeViewUpdateIn input) {

        return officeService.updateOffice(input);
    }

    @ApiOperation(value = "Create new office", httpMethod = "POST")
    @PostMapping(value = "/api/office/save", consumes = APPLICATION_JSON_VALUE)
    public OfficeViewSaveOut getOfficeSave(@RequestBody OfficeViewSaveIn input) {

        return officeService.saveOffice(input);
    }
}
