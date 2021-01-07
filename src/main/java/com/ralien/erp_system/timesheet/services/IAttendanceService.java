package com.ralien.erp_system.timesheet.services;

import com.ralien.erp_system.timesheet.dto.EmpAttendanceInDateRangeResp;
import com.ralien.erp_system.timesheet.dto.MarkAttendanceReq;

import java.util.Date;

public interface IAttendanceService {
    void markAttendance(MarkAttendanceReq req);
    EmpAttendanceInDateRangeResp getAllAttendances(int empId, Date fromDate, Date toDate);
    EmpAttendanceInDateRangeResp getAllAttendances(Date workDate);
}
