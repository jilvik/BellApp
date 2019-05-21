package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class OrganizationViewSaveIn {

    @NotBlank
    private String name;

    @NotBlank
    private String fullName;

    @NotBlank
    private String inn;

    @NotBlank
    private String kpp;

    @NotBlank
    private String address;

    private String phone;
    private boolean isActive;
}