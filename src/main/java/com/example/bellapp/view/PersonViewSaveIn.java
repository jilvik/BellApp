package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@ToString
public class PersonViewSaveIn {

    @NotEmpty
    private Integer officeId;

    private String lastName;

    @NotEmpty
    private String firstName;

    private String middleName;

    @NotEmpty
    private String post;

    private String phone;
    private String docCode;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryCode;
    private boolean isIdentified;
}