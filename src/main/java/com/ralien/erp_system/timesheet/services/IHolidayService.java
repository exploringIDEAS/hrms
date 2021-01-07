package com.ralien.erp_system.timesheet.services;

import com.ralien.erp_system.timesheet.dto.AddHolidayReq;
import com.ralien.erp_system.timesheet.dto.HolidayListForYearResp;

public interface IHolidayService {
    void addHoliday(AddHolidayReq req);
    HolidayListForYearResp getAllHolidays(int year);
}
