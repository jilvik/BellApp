package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ApiModel(description = "Person by ID")
@Getter
@Setter
@ToString
public class PersonViewId {

    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String phone;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryName;
    private String countryCode;
    private boolean isIdentified;
}