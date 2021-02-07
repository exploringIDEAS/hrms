package com.ralien.erp_system.timesheet.api;

import com.ralien.erp_system.timesheet.dto.AddHolidayReq;
import com.ralien.erp_system.timesheet.services.IHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("holidays")
public class HolidayResource {
    @Autowired
    private IHolidayService holidayService;

    @PostMapping
    public ResponseEntity<Object> addNewHoliday(@Valid @RequestBody AddHolidayReq req) {
        holidayService.addHoliday(req);
        return new ResponseEntity<>("added", HttpStatus.CREATED);
    }

    @GetMapping("{year}")
    public ResponseEntity<Object> getHolidayInYear(@PathVariable int year) {
        return ResponseEntity.ok(holidayService.getAllHolidays(year));
    }
}
