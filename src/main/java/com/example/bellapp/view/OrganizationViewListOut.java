package com.example.bellapp.view;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Response from organizations as a list")
@Getter
@Setter
@ToString
public class OrganizationViewListOut {

    private Integer id;
    private String name;
    private boolean isActive;
}
