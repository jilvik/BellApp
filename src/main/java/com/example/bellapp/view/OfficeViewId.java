package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OfficeViewId {

    private Integer id;
    private String name;
    private String address;
    private String phone;
    private boolean isActive;

}

//6. api/office/{id}
//        method:GET
//        Out:
//        {
//        “id”:””,
//        “name”:””,
//        “address”:””,
//        “phone”,””,
//        “isActive”:”true”
//        }