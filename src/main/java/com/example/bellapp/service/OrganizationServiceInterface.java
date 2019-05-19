package com.example.bellapp.service;

import com.example.bellapp.view.OrganizationViewUpdateIn;
import com.example.bellapp.view.OrganizationViewUpdateOut;

public interface OrganizationServiceInterface {

    OrganizationViewUpdateOut updateOrganization(OrganizationViewUpdateIn input);

}
