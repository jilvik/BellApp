package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@ToString
public class PersonViewUpdateIn {

    @NotBlank
    private Integer id;

    private Integer officeId;
    private String lastName;

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String post;

    private String phone;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryCode;
    private boolean isIdentified;
}