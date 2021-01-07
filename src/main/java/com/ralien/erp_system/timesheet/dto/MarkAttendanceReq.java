package com.ralien.erp_system.timesheet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ralien.erp_system.timesheet.util.AttendanceSource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkAttendanceReq {
    @Positive
    private int empId;
    @NotNull
    private Date workDate;
    private AttendanceSource source;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public AttendanceSource getSource() {
        return source;
    }

    public void setSource(AttendanceSource source) {
        this.source = source;
    }
}
