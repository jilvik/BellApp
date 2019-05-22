package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for search persons")
@Getter
@Setter
@ToString
public class PersonViewListIn {

    @NotBlank
    private Integer officeId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String docCode;
    private String countryCode;
}