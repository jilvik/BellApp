package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class OrganizationViewListIn {

    @NotBlank
    private String name;
    private String inn;
    private boolean isActive;
}