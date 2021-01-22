package com.ralien.erp_system.timesheet.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ralien.erp_system.timesheet.util.UnixDateSerializer;

import java.util.Date;

public class EmpLeaveStockResp {
    private int leaveStockId;
    private int empId;
    private int sickLeave;
    private int casualLeave;
    private int earnedLeave;
    private int maternityLeave;
    private int paternityLeave;
    @JsonSerialize(using= UnixDateSerializer.class)
    private Date calendarStartDate;
    @JsonSerialize(using = UnixDateSerializer.class)
    private Date calendarEndDate;

    public int getLeaveStockId() {
        return leaveStockId;
    }

    public void setLeaveStockId(int leaveStockId) {
        this.leaveStockId = leaveStockId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSickLeave() {
        return sickLeave;
    }

    public void setSickLeave(int sickLeave) {
        this.sickLeave = sickLeave;
    }

    public int getCasualLeave() {
        return casualLeave;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public int getEarnedLeave() {
        return earnedLeave;
    }

    public void setEarnedLeave(int earnedLeave) {
        this.earnedLeave = earnedLeave;
    }

    public int getMaternityLeave() {
        return maternityLeave;
    }

    public void setMaternityLeave(int maternityLeave) {
        this.maternityLeave = maternityLeave;
    }

    public int getPaternityLeave() {
        return paternityLeave;
    }

    public void setPaternityLeave(int paternityLeave) {
        this.paternityLeave = paternityLeave;
    }

    public Date getCalendarStartDate() {
        return calendarStartDate;
    }

    public void setCalendarStartDate(Date calendarStartDate) {
        System.out.println("date=" + calendarStartDate);
        this.calendarStartDate = calendarStartDate;
    }

    public Date getCalendarEndDate() {
        return calendarEndDate;
    }

    public void setCalendarEndDate(Date calendarEndDate) {
        System.out.println("date=" + calendarEndDate);
        this.calendarEndDate = calendarEndDate;
    }
}
