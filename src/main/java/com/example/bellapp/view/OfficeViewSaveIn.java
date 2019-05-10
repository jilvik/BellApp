package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class OfficeViewSaveIn {

    @NotEmpty
    private Integer orgId;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;

}

//8. api/office/save
//        In:
//        {
//        “orgId”:””, //обязательный параметр
//        “name”:””,
//        “address”:””,
//        “phone”,””,
//        “isActive”:”true”
//        }
//
//        Out:
//        {
//        “result”:”success”
//        }