package com.example.bellapp.controller;


import com.example.bellapp.service.DocTypeService;
import com.example.bellapp.view.DocTypeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocTypeController {

    @Autowired
    private DocTypeService docTypeService;


    @PostMapping("api/docs")
    public List<DocTypeView> getDocTypeList() {

        return docTypeService.getDocTypes();
    }

}
