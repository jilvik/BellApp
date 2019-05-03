package com.example.bellapp.view;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ApiModel (description = "Country")
@Getter
@Setter
@ToString
public class CountryView {

    private String code;
    private String name;
}
