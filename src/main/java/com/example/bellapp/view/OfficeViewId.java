package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Office by ID")
@Getter
@Setter
@ToString
public class OfficeViewId {

    private Integer id;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;
}