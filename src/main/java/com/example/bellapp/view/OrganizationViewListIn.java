package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class OrganizationViewListIn {

    @NotEmpty
    private String name;
    private String inn;
    private boolean isActive;

}

//1. api/organization/list
//        In (фильтр):
//        {
//        “name”:””, //обязательный параметр
//        “inn”:””,
//        “isActive”:””
//        }
//        Out:
//        [
//        {
//        “id”:””,
//        “name”:””,
//        “isActive”:”true”
//        },