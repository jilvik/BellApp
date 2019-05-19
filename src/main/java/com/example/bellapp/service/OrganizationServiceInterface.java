package com.example.bellapp.service;

import com.example.bellapp.view.*;

import java.util.List;

public interface OrganizationServiceInterface {

    List<OrganizationViewListOut> findOrganizations(OrganizationViewListIn input);

    OrganizationViewId getOrganization(Integer id);

    OrganizationViewUpdateOut updateOrganization(OrganizationViewUpdateIn input);

    OrganizationViewSaveOut saveOrganization(OrganizationViewSaveIn input);
}
