package com.ralien.erp_system.timesheet.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class UpdateOfficeShiftReq {
    @NotBlank
    @Length(max=30)
    private String title;
    private int startAt;
    private int hours;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
