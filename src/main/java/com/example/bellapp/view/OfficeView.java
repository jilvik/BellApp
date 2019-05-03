package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel (description = "Office")
@Getter
@Setter
@ToString
public class OfficeView {

    private Integer id;
    private Integer ogrId;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;
}
