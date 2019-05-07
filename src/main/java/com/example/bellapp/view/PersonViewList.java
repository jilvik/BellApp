package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class PersonViewList {

    @NotEmpty
    private Integer id;
    private Integer officeId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String phone;
    private String docCode;
    private String countryCode;

    @Override
    public String toString() {
        return "{id:" + id + ";LastName:" + lastName + "FirstName" + firstName
                + "MiddleName" + middleName + "Post" + post + "}";
    }
}

//9. api/user/list
//        In (фильтр):
//        {
//        “officeId”:””, //обязательный параметр
//        “firstName”:””,
//        “lastName”:””,
//        “middleName”:””,
//        “position”,””,
//        “docCode”:””,
//        “citizenshipCode”:””
//        }
//        Out:
//        {
//        “id”:””,
//        “firstName”:””,
//        “secondName”:””,
//        “middleName”:””,
//        “position”:””
//        }