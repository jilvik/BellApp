package com.example.bellapp.service;

import com.example.bellapp.view.*;

import java.util.List;

public interface OfficeServiceInterface {

    List<OfficeViewListOut> findOffices(OfficeViewListIn input);

    OfficeViewId getOffice(Integer id);

    OfficeViewUpdateOut updateOffice(OfficeViewUpdateIn input);

    OfficeViewSaveOut saveOffice(OfficeViewSaveIn input);
}
