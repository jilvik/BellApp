package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Result of create office")
@Getter
@Setter
@ToString
public class OfficeViewSaveOut {

    private String result;
}