package com.ralien.erp_system.timesheet.entities;

import com.ralien.erp_system.timesheet.util.LeaveProver;
import com.ralien.erp_system.timesheet.util.LeaveReqState;
import com.ralien.erp_system.timesheet.util.LeaveType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheet_leave_request")
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int empId;
    private Date fromDate;
    private Date toDate;
    private LeaveType leaveType;
    private LeaveReqState leaveReqState;
    private LeaveProver approvedBy;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date createdAt;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public LeaveReqState getLeaveReqState() {
        return leaveReqState;
    }

    public void setLeaveReqState(LeaveReqState leaveReqState) {
        this.leaveReqState = leaveReqState;
    }

    public LeaveProver getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(LeaveProver approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
