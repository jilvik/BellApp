package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel (description = "Organization")
@Getter
@Setter
@ToString
public class OrganiztionView {

    private Integer id;
    private String name;
    private String inn;
    private String kpp;
    private boolean isActive;
}
