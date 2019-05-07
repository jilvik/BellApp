package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PersonViewSave {

    private Integer officeId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String phone;
    private String docCode;
    private String docName;
    private String documentNumber;
    private Date documentDate;
    private String countryCode;
    private boolean isIdentified;

}

//12. api/user/save
//        In:
//        {
//        “officeId”:””, //обязательный параметр
//        “firstName”:””, //обязательный параметр
//        “secondName”:””,
//        “middleName”:””,
//        “position”:”” //обязательный параметр
//        “phone”,””,
//        “docCode”:””,
//        “docName”:””,
//        “docNumber”:””,
//        “docDate”:””,
//        “citizenshipCode”:””,
//        “isIdentified”:”true” //пример
//        }