package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class OfficeViewList {

    private Integer id;

    @NotEmpty
    private Integer ogrId;

    private String name;

    private String phone;

    private boolean isActive;

    @Override
    public String toString() {
        return "{id:" + id + ";name:" + name + ";isActive:" + isActive + "}";
    }
}

//5. api/office/list
//        In (фильтр):
//        {
//        “orgId”:””, //обязательный параметр
//        “name”:””,
//        “phone”:””,
//        “isActive”
//        }
//
//        Out:
//        [
//        {
//        “id”:””,
//        “name”:””,
//        “isActive”:”true”
//        },