package com.ralien.erp_system.timesheet.dto;

import java.util.ArrayList;
import java.util.List;

public class OfficeAllShiftResp {
    List<OfficeShiftResp> shifts;

    public OfficeAllShiftResp() {
        shifts = new ArrayList<>();
    }

    public List<OfficeShiftResp> getShifts() {
        return shifts;
    }

    public void setShifts(List<OfficeShiftResp> shifts) {
        this.shifts = shifts;
    }
}
