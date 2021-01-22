package com.ralien.erp_system.timesheet.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

public class UpdateEmpLeaveStockReq {
    @Positive
    private int empId;
    @Min(0)
    private int sickLeave;
    @Min(0)
    private int casualLeave;
    @Min(0)
    private int earnedLeave;
    @Min(0)
    private int maternityLeave;
    @Min(0)
    private int paternityLeave;
    @NotNull
    private Date calendarStartDate;
    @NotNull
    private Date calendarEndDate;

    public UpdateEmpLeaveStockReq() {
    }

    public UpdateEmpLeaveStockReq(int empId, int sickLeave, int casualLeave, int earnedLeave, int maternityLeave, int paternityLeave, Date calendarStartDate, Date calendarEndDate) {
        this.empId = empId;
        this.sickLeave = sickLeave;
        this.casualLeave = casualLeave;
        this.earnedLeave = earnedLeave;
        this.maternityLeave = maternityLeave;
        this.paternityLeave = paternityLeave;
        this.calendarStartDate = calendarStartDate;
        this.calendarEndDate = calendarEndDate;
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
        this.calendarStartDate = calendarStartDate;
    }

    public Date getCalendarEndDate() {
        return calendarEndDate;
    }

    public void setCalendarEndDate(Date calendarEndDate) {
        this.calendarEndDate = calendarEndDate;
    }
}
