package com.example.bellapp.controller;


import com.example.bellapp.view.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OfficeController {

    @PostMapping("/api/office/list")
    public List<OfficeViewListOut> getOfficeList(@RequestBody OfficeViewListIn input) {

        OfficeViewListIn officeViewList = new OfficeViewListIn();

        officeViewList.setOgrId(1);
        officeViewList.setName("testName");
        officeViewList.setPhone("testPhone");
        officeViewList.setActive(true);

        OfficeViewListOut officeViewListOut = new OfficeViewListOut();

        officeViewListOut.setId(3);
        officeViewListOut.setName("testOutName");
        officeViewListOut.setActive(true);

        return Arrays.asList(officeViewListOut);
    }

    @GetMapping("/api/office/{id}")
    public OfficeViewId getOfficeId(@PathVariable Integer id){
        OfficeViewId officeViewId = new OfficeViewId();

        officeViewId.setId(2);
        officeViewId.setName("testName");
        officeViewId.setAddress("testAddress");
        officeViewId.setPhone("testPhone");
        officeViewId.setActive(true);

        return officeViewId;
    }

    @PostMapping("/api/office/update")
    public OfficeViewUpdateOut getOfficeUpdate(@RequestBody OfficeViewUpdateIn input) {

        OfficeViewUpdateIn officeViewUpdate = new OfficeViewUpdateIn();

        officeViewUpdate.setId(3);
        officeViewUpdate.setName("testName");
        officeViewUpdate.setAddress("testAddress");
        officeViewUpdate.setPhone("testPhone");
        officeViewUpdate.setActive(true);

        OfficeViewUpdateOut officeViewUpdateOut = new OfficeViewUpdateOut();
        officeViewUpdateOut.setResult("success");

        return officeViewUpdateOut;
    }

    @PostMapping("/api/office/save")
    public OfficeViewSaveOut getOfficeSave(@RequestBody OfficeViewSaveIn input) {

        OfficeViewUpdateIn officeViewUpdate = new OfficeViewUpdateIn();

        officeViewUpdate.setId(3);
        officeViewUpdate.setName("testName");
        officeViewUpdate.setAddress("testAddress");
        officeViewUpdate.setPhone("testPhone");
        officeViewUpdate.setActive(true);

        OfficeViewSaveOut officeViewSaveOut = new OfficeViewSaveOut();
        officeViewSaveOut.setResult("success");

        return officeViewSaveOut;
    }

}
