package com.example.bellapp.view;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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