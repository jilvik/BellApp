package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

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

//10. api/user/{id}
//        method:GET
//        Out:
//        {
//        “id”:””,
//        “firstName”:””,
//        “secondName”:””,
//        “middleName”:””,
//        “position”:””
//        “phone”,””,
//        “docName”:””,
//        “docNumber”:””,
//        “docDate”:””,
//        “citizenshipName”:””,
//        “citizenshipCode”:””,
//        “isIdentified”:”true”
//        }