package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class OrganizationViewSave {

    @NotEmpty
    private String name;

    @NotEmpty
    private String fullName;

    @NotEmpty
    private String inn;

    @NotEmpty
    private String kpp;

    @NotEmpty
    private String address;

    private String phone;

    private boolean isActive;

}

//4. api/organization/save
//        In: {
//        “name”:””, //обязательный параметр
//        “fullName”:””, //обязательный параметр
//        “inn”:””, //обязательный параметр
//        “kpp”:””, //обязательный параметр
//        “address”:””, //обязательный параметр
//        “phone”,””,
//        “isActive”:”true”
//        }
//
//        Out:
//        {
//        “result”:”success”
//        }