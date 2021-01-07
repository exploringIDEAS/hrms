package com.ralien.erp_system.timesheet.dao;

import com.ralien.erp_system.timesheet.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    List<Attendance> findByEmpIdAndWorkDateBetween(int empId, Date startDate, Date endDate);
    List<Attendance> findByWorkDate(Date workDate);
}
