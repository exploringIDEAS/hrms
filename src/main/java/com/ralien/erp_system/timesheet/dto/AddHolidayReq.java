package com.ralien.erp_system.timesheet.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class AddHolidayReq {
    @NotNull
    private Date holidayDate;
    @NotNull
    private String desc;
    private boolean optional;

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
