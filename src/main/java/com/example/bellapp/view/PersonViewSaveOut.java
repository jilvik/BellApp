package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Result of create person")
@Getter
@Setter
@ToString
public class PersonViewSaveOut {

    private String result;
}
