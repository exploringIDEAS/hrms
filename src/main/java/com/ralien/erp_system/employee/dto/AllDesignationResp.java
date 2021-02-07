package com.ralien.erp_system.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class AllDesignationResp {
    List<DesignationResp> designations;

    public AllDesignationResp() {
        designations = new ArrayList<>();
    }

    public List<DesignationResp> getDesignations() {
        return designations;
    }

    public void setDesignations(List<DesignationResp> designations) {
        this.designations = designations;
    }
}
