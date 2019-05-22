package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@ApiModel(description = "Request for create person")
@Getter
@Setter
@ToString
public class PersonViewSaveIn {

    @NotBlank
    private Integer officeId;

    private String lastName;

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String post;

    private String phone;
    private String docCode;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryCode;
    private boolean isIdentified;
}