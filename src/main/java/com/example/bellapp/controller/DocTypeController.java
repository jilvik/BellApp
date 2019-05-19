package com.example.bellapp.controller;


import com.example.bellapp.dao.DocTypeDao;
import com.example.bellapp.model.DocType;
import com.example.bellapp.view.DocTypeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DocTypeController {

    @Autowired
    private DocTypeDao docTypeDao;

    @PostMapping("api/docs")
    public List<DocTypeView> getDocTypeList() {

        Iterable<DocType> allTypes = docTypeDao.findAll();
        List<DocTypeView> docTypeList = new ArrayList<>();

        for (DocType docType: allTypes) {
            DocTypeView output = new DocTypeView();
            output.setName(docType.getName());
            output.setCode(docType.getCode());
            docTypeList.add(output);
        }

        return docTypeList;
    }

}
