package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for create office")
@Getter
@Setter
@ToString
public class OfficeViewSaveIn {

    @NotBlank
    private Integer orgId;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;
}