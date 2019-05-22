package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Response from persons as a list")
@Getter
@Setter
@ToString
public class PersonViewListOut {

    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String post;
}
