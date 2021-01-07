package com.ralien.erp_system.timesheet.services;

import com.ralien.erp_system.timesheet.dto.AddLeaveReq;
import com.ralien.erp_system.timesheet.dto.ApproveLeaveMetaReq;
import com.ralien.erp_system.timesheet.dto.UpdateLeaveReq;

public interface ILeaveReqService {
    void addLeaveReq(AddLeaveReq req);
    void updateLeaveReq(int leaveReqId, UpdateLeaveReq req);
    void deleteLeaveReq(int leaveReqId);
    void approveLeaveReq(int leaveReqId, ApproveLeaveMetaReq req);
}
