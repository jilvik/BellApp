package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@ApiModel (description = "Person")
@Getter
@Setter
public class PersonView {

    private Integer id;
    private Integer oficeId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String phone;
    private String documentId;
    private String countryId;
    private boolean isIdentified;
}
