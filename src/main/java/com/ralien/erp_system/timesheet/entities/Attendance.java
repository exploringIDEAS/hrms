package com.ralien.erp_system.timesheet.entities;

import com.ralien.erp_system.timesheet.util.AttendanceSource;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheet_attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int empId;
    private Date workDate;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date markedAt;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;
    private AttendanceSource source;

    public int getId() {
        return id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Date getMarkedAt() {
        return markedAt;
    }

    public void setMarkedAt(Date markedAt) {
        this.markedAt = markedAt;
    }

    public AttendanceSource getSource() {
        return source;
    }

    public void setSource(AttendanceSource source) {
        this.source = source;
    }
}
