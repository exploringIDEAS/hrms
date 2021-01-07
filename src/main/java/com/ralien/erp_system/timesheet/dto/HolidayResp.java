package com.ralien.erp_system.timesheet.dto;

import java.util.Date;

public class HolidayResp {
    private int holidayId;
    private Date holidayDate;
    private String desc;
    private boolean optional;

    public HolidayResp() {
    }

    public HolidayResp(int holidayId, Date holidayDate, String desc, boolean optional) {
        this.holidayId = holidayId;
        this.holidayDate = holidayDate;
        this.desc = desc;
        this.optional = optional;
    }

    public int getHolidayId() {
        return holidayId;
    }

    public void setHolidayId(int holidayId) {
        this.holidayId = holidayId;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }
}
