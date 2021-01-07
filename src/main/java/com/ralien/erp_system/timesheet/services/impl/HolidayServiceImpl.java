package com.ralien.erp_system.timesheet.services.impl;

import com.ralien.erp_system.timesheet.dao.HolidayRepository;
import com.ralien.erp_system.timesheet.dto.AddHolidayReq;
import com.ralien.erp_system.timesheet.dto.HolidayListForYearResp;
import com.ralien.erp_system.timesheet.dto.HolidayResp;
import com.ralien.erp_system.timesheet.entities.Holiday;
import com.ralien.erp_system.timesheet.services.IHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HolidayServiceImpl implements IHolidayService {
    @Autowired
    private HolidayRepository holidayRepo;

    @Override
    @Transactional
    public void addHoliday(AddHolidayReq req) {
        Holiday holiday = new Holiday();
        holiday.setHolidayDate(req.getHolidayDate());
        holiday.setOptional(req.isOptional());
        holiday.setDescription(req.getDesc());
        holidayRepo.save(holiday);
    }

    @Override
    public HolidayListForYearResp getAllHolidays(int year) {
        List<Holiday> holidayList = holidayRepo.getAllHolidaysOfYear(year);
        HolidayListForYearResp holidayListForYearResp = new HolidayListForYearResp();
        for (Holiday holiday: holidayList) {
            HolidayResp holidayResp = new HolidayResp();
            holidayResp.setDesc(holiday.getDescription());
            holidayResp.setHolidayDate(holiday.getHolidayDate());
            holidayResp.setOptional(holiday.isOptional());
            holidayResp.setHolidayId(holiday.getId());
            holidayListForYearResp.getHolidays().add(holidayResp);
        }
        return holidayListForYearResp;
    }
}
