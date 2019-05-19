package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
public class PersonViewUpdateIn {

    @NotNull
    private Integer id;

    private Integer officeId;

    @NotNull
    private String lastName;

    private String firstName;
    private String middleName;

    @NotNull
    private String post;

    private String phone;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryCode;
    private boolean isIdentified;
}