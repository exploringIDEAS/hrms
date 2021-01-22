package com.ralien.erp_system.timesheet.api;

import com.ralien.erp_system.timesheet.dto.AddLeaveReq;
import com.ralien.erp_system.timesheet.dto.ApproveLeaveMetaReq;
import com.ralien.erp_system.timesheet.dto.UpdateLeaveReq;
import com.ralien.erp_system.timesheet.services.ILeaveReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("leave_requests")
public class LeaveRequestResource {
    @Autowired
    private ILeaveReqService leaveReqService;

    @PostMapping
    public ResponseEntity<Object> addLeaveReq(@Valid @RequestBody AddLeaveReq req) {
        leaveReqService.addLeaveReq(req);
        return new ResponseEntity<>("added", HttpStatus.CREATED);
    }

    @PutMapping("{leave_req_id}")
    public ResponseEntity<Object> updateLeaveReq(@PathVariable("leave_req_id") int leaveReqId, @Valid @RequestBody UpdateLeaveReq req) {
        leaveReqService.updateLeaveReq(leaveReqId, req);
        return new ResponseEntity<>("updated", HttpStatus.NO_CONTENT);
    }

    @PutMapping("{leave_req_id}/approve")
    public ResponseEntity<Object> approveLeaveReq(@PathVariable int leaveReqId, @Valid @RequestBody ApproveLeaveMetaReq req) {
        leaveReqService.approveLeaveReq(leaveReqId, req);
        return new ResponseEntity<>("approved", HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{leave_req_id}")
    public ResponseEntity<Object> deleteLeaveReq(@PathVariable int leaveReqId) {
        leaveReqService.deleteLeaveReq(leaveReqId);
        return new ResponseEntity<>("deleted", HttpStatus.NO_CONTENT);
    }
}
