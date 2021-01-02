package com.ralien.erp_system.employee.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewDesignationReq {
    @NotBlank
    @Length(max=50)
    private String designationName;
}
