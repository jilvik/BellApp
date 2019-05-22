package com.example.bellapp.view;


import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Request for search offices")
@Getter
@Setter
@ToString
public class OfficeViewListIn {

    @NotBlank
    private Integer orgId;
    private String name;
    private String phone;
    private boolean isActive;
}