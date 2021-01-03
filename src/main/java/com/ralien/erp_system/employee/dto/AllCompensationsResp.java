package com.ralien.erp_system.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class AllCompensationsResp {
    private List<CompensationResp> compensationRespList;

    public AllCompensationsResp() {
        compensationRespList = new ArrayList<>();
    }

    public List<CompensationResp> getCompensationRespList() {
        return compensationRespList;
    }

    public void setCompensationRespList(List<CompensationResp> compensationRespList) {
        this.compensationRespList = compensationRespList;
    }
}
