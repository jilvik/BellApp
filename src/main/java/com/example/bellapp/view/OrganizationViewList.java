package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class OrganizationViewList {

    @NotEmpty
    private Integer id;
    private String name;
    private String inn;
    private boolean isActive;

    @Override
    public String toString() {
        return "{id:" + id + ";name:" + name + ";isActive:" + isActive + "}";
    }

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