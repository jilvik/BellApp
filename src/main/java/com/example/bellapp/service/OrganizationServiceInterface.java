package com.example.bellapp.service;

import com.example.bellapp.view.OrganizationViewId;
import com.example.bellapp.view.OrganizationViewListIn;
import com.example.bellapp.view.OrganizationViewListOut;
import com.example.bellapp.view.OrganizationViewSaveIn;
import com.example.bellapp.view.OrganizationViewSaveOut;
import com.example.bellapp.view.OrganizationViewUpdateIn;
import com.example.bellapp.view.OrganizationViewUpdateOut;

import java.util.List;

public interface OrganizationServiceInterface {

    List<OrganizationViewListOut> findOrganizations(OrganizationViewListIn input);

    OrganizationViewId getOrganization(Integer id);

    OrganizationViewUpdateOut updateOrganization(OrganizationViewUpdateIn input);

    OrganizationViewSaveOut saveOrganization(OrganizationViewSaveIn input);
}
