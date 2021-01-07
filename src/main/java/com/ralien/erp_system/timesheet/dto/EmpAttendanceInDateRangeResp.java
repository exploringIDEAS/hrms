package com.ralien.erp_system.timesheet.dto;

import java.util.ArrayList;
import java.util.List;

public class EmpAttendanceInDateRangeResp {
    List<EmpAttendanceResp> attendances;

    public EmpAttendanceInDateRangeResp() {
        attendances = new ArrayList<>();
    }

    public List<EmpAttendanceResp> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<EmpAttendanceResp> attendances) {
        this.attendances = attendances;
    }
}
