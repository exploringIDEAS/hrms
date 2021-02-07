package com.ralien.erp_system.timesheet.dto;

import com.ralien.erp_system.timesheet.util.LeaveProver;
import com.ralien.erp_system.timesheet.util.LeaveReqState;

public class ApproveLeaveMetaReq {
    private LeaveReqState leaveReqState;
    private LeaveProver leaveProver;

    public LeaveReqState getLeaveReqState() {
        return leaveReqState;
    }

    public void setLeaveReqState(LeaveReqState leaveReqState) {
        this.leaveReqState = leaveReqState;
    }

    public LeaveProver getLeaveProver() {
        return leaveProver;
    }

    public void setLeaveProver(LeaveProver leaveProver) {
        this.leaveProver = leaveProver;
    }
}
