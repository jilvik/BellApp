package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for update office")
@Getter
@Setter
@ToString
public class OfficeViewUpdateIn {

    @NotBlank
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String address;

    private String phone;
    private boolean isActive;
}