package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for update organization")
@Getter
@Setter
@ToString
public class OrganizationViewUpdateIn {

    @NotBlank
    private Integer id;

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
