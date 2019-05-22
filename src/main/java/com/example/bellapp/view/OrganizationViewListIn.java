package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for search organizations")
@Getter
@Setter
@ToString
public class OrganizationViewListIn {

    @NotBlank
    private String name;
    private String inn;
    private boolean isActive;
}