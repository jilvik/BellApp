package com.example.bellapp.service;

import com.example.bellapp.dao.DocTypeDao;
import com.example.bellapp.model.DocType;
import com.example.bellapp.view.DocTypeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocTypeService implements DocTypeServiceInterface {

    @Autowired
    private DocTypeDao docTypeDao;


    @Override
    public List<DocTypeView> getDocTypes() {

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
