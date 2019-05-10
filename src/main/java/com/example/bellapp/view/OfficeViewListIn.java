package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class OfficeViewListIn {

    @NotEmpty
    private Integer ogrId;
    private String name;
    private String phone;
    private boolean isActive;

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