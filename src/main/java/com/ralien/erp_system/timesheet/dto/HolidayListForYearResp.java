package com.ralien.erp_system.timesheet.dto;

import java.util.ArrayList;
import java.util.List;

public class HolidayListForYearResp {
    private List<HolidayResp> holidays;

    public HolidayListForYearResp() {
        holidays = new ArrayList<>();
    }

    public List<HolidayResp> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<HolidayResp> holidays) {
        this.holidays = holidays;
    }
}
