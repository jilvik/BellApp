package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Organization by ID")
@Getter
@Setter
@ToString
public class OrganizationViewId {

   private Integer id;
   private String name;
   private String fullName;
   private String inn;
   private String kpp;
   private String address;
   private String phone;
   private boolean isActive;
}