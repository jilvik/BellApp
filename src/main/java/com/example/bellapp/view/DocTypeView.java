package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel (description = "Document type")
@Getter
@Setter
@ToString
public class DocTypeView {

    private String code;
    private String name;
}
