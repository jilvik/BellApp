package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Result of update person")
@Getter
@Setter
@ToString
public class PersonViewUpdateOut {

    private String result;
}
