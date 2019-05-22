package com.example.bellapp.service;

import com.example.bellapp.view.OfficeViewId;
import com.example.bellapp.view.OfficeViewListIn;
import com.example.bellapp.view.OfficeViewListOut;
import com.example.bellapp.view.OfficeViewSaveIn;
import com.example.bellapp.view.OfficeViewSaveOut;
import com.example.bellapp.view.OfficeViewUpdateIn;
import com.example.bellapp.view.OfficeViewUpdateOut;

import java.util.List;

public interface OfficeServiceInterface {

    List<OfficeViewListOut> findOffices(OfficeViewListIn input);

    OfficeViewId getOffice(Integer id);

    OfficeViewUpdateOut updateOffice(OfficeViewUpdateIn input);

    OfficeViewSaveOut saveOffice(OfficeViewSaveIn input);
}
