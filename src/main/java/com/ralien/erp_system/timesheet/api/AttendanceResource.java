package com.ralien.erp_system.timesheet.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ralien.erp_system.timesheet.dto.MarkAttendanceReq;
import com.ralien.erp_system.timesheet.services.IAttendanceService;
import com.ralien.erp_system.timesheet.util.UnixDateSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static com.ralien.erp_system.timesheet.util.Constants.DATE_FORMAT;

@RestControllerAdvice
@RequestMapping("attendances")
public class AttendanceResource {
    @Autowired
    private IAttendanceService attendanceService;

    @PostMapping
    public ResponseEntity<Object> markAttendance(@Valid @RequestBody MarkAttendanceReq req) {
        attendanceService.markAttendance(req);
        return new ResponseEntity<>("marked", HttpStatus.CREATED);
    }

    @GetMapping("on_date/{workDate}")
    public ResponseEntity<Object> getAllAttendancesOnWorkDate(@PathVariable @NotNull @DateTimeFormat(pattern = "yyyy-MM-dd") Date workDate) {
        return ResponseEntity.ok(attendanceService.getAllAttendances(workDate));
    }

    @GetMapping("emp/{empId}/from/{fromDate}/to/{toDate}")
    public ResponseEntity<Object> getAttendancesOfEmpBtw(@PathVariable int empId,
                                                         @PathVariable @NotNull @DateTimeFormat(pattern = DATE_FORMAT) Date fromDate,
                                                         @PathVariable @NotNull @DateTimeFormat(pattern = DATE_FORMAT) Date toDate) {
        return ResponseEntity.ok(attendanceService.getAllAttendances(empId, fromDate, toDate));
    }
}
