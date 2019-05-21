package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

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