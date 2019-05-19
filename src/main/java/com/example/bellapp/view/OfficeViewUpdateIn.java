package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class OfficeViewUpdateIn {

    @NotEmpty
    private Integer id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String address;

    private String phone;
    private boolean isActive;
}