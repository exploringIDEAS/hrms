package com.ralien.erp_system.timesheet.services.impl;

import com.ralien.erp_system.timesheet.dao.AttendanceRepository;
import com.ralien.erp_system.timesheet.dto.*;
import com.ralien.erp_system.timesheet.entities.Attendance;
import com.ralien.erp_system.timesheet.services.IAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AttendanceServiceImpl implements IAttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepo;

    @Override
    @Transactional
    public void markAttendance(MarkAttendanceReq req) {
        Attendance attendance = new Attendance();
        attendance.setEmpId(req.getEmpId());
        attendance.setWorkDate(req.getWorkDate());
        attendance.setSource(req.getSource());
        attendanceRepo.save(attendance);
    }

    @Override
    public EmpAttendanceInDateRangeResp getAllAttendances(int empId, Date fromDate, Date toDate) {
        List<Attendance> attendanceList = attendanceRepo.findByEmpIdAndWorkDateBetween(empId, fromDate, toDate);
        EmpAttendanceInDateRangeResp empAttendanceInDateRangeResp = new EmpAttendanceInDateRangeResp();
        for (Attendance attendance: attendanceList) {
            empAttendanceInDateRangeResp.getAttendances().add(convertToAttendanceResp(attendance));
        }
        return empAttendanceInDateRangeResp;
    }

    @Override
    public EmpAttendanceInDateRangeResp getAllAttendances(Date workDate) {
        List<Attendance> attendanceList = attendanceRepo.findByWorkDate(workDate);
        EmpAttendanceInDateRangeResp empAttendanceInDateRangeResp = new EmpAttendanceInDateRangeResp();
        for (Attendance attendance: attendanceList) {
            empAttendanceInDateRangeResp.getAttendances().add(convertToAttendanceResp(attendance));
        }
        return empAttendanceInDateRangeResp;
    }

    public EmpAttendanceResp convertToAttendanceResp(Attendance attendance) {
        EmpAttendanceResp attendanceResp = new EmpAttendanceResp();
        attendanceResp.setAttendanceId(attendance.getId());
        attendanceResp.setMarkedAt(attendance.getMarkedAt());
        attendanceResp.setWorkDate(attendance.getWorkDate());
        attendanceResp.setSource(attendance.getSource());
        attendanceResp.setEmpId(attendance.getEmpId());
        return attendanceResp;
    }
}
