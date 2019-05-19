package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class PersonViewListIn {

    @NotEmpty
    private Integer officeId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
    private String docCode;
    private String countryCode;

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