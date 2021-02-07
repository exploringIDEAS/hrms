package com.ralien.erp_system.timesheet.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ralien.erp_system.timesheet.util.AttendanceSource;
import com.ralien.erp_system.timesheet.util.UnixDateSerializer;
import com.ralien.erp_system.timesheet.util.UnixDateTimeSerializer;

import java.util.Date;

public class EmpAttendanceResp {
    private int attendanceId;
    private int empId;
    @JsonSerialize(using = UnixDateSerializer.class)
    private Date workDate;
    @JsonSerialize(using = UnixDateTimeSerializer.class)
    private Date markedAt;
    private AttendanceSource source;

    public EmpAttendanceResp() {
    }

    public EmpAttendanceResp(int attendanceId, int empId, Date workDate, Date markedAt, AttendanceSource source) {
        this.empId = empId;
        this.attendanceId = attendanceId;
        this.workDate = workDate;
        this.markedAt = markedAt;
        this.source = source;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Date getMarkedAt() {
        return markedAt;
    }

    public void setMarkedAt(Date markedAt) {
        this.markedAt = markedAt;
    }

    public AttendanceSource getSource() {
        return source;
    }

    public void setSource(AttendanceSource source) {
        this.source = source;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
