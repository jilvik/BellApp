package com.example.bellapp.controller;


import com.example.bellapp.view.OfficeViewId;
import com.example.bellapp.view.OfficeViewList;
import com.example.bellapp.view.OfficeViewSave;
import com.example.bellapp.view.OfficeViewUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OfficeController {

    @PostMapping("/api/office/list")
    public List<OfficeViewList> getOfficeList(@RequestBody OfficeViewList query) {

        OfficeViewList officeViewList = new OfficeViewList();

        officeViewList.setOgrId(1);
        officeViewList.setName("testName");
        officeViewList.setPhone("testPhone");
        officeViewList.setActive(true);

        return Arrays.asList(officeViewList);
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
    public String getOfficeUpdate(@RequestBody OfficeViewUpdate query) {

        OfficeViewUpdate officeViewUpdate = new OfficeViewUpdate();

        officeViewUpdate.setId(3);
        officeViewUpdate.setName("testName");
        officeViewUpdate.setAddress("testAddress");
        officeViewUpdate.setPhone("testPhone");
        officeViewUpdate.setActive(true);

        return "success";
    }

    @PostMapping("/api/office/save")
    public String getOfficeSave(@RequestBody OfficeViewSave query) {

        OfficeViewUpdate officeViewUpdate = new OfficeViewUpdate();

        officeViewUpdate.setId(3);
        officeViewUpdate.setName("testName");
        officeViewUpdate.setAddress("testAddress");
        officeViewUpdate.setPhone("testPhone");
        officeViewUpdate.setActive(true);

        return "success";
    }

}
