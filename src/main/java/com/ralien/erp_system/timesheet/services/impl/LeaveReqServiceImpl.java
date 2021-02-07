package com.ralien.erp_system.timesheet.services.impl;

import com.ralien.erp_system.timesheet.dao.LeaveRequestRepository;
import com.ralien.erp_system.timesheet.dto.AddLeaveReq;
import com.ralien.erp_system.timesheet.dto.ApproveLeaveMetaReq;
import com.ralien.erp_system.timesheet.dto.UpdateLeaveReq;
import com.ralien.erp_system.timesheet.entities.LeaveRequest;
import com.ralien.erp_system.timesheet.services.ILeaveReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class LeaveReqServiceImpl implements ILeaveReqService {
    @Autowired
    private LeaveRequestRepository leaveRequestRepo;

    @Override
    @Transactional
    public void addLeaveReq(AddLeaveReq req) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setEmpId(req.getEmpId());
        leaveRequest.setFromDate(req.getFromDate());
        leaveRequest.setToDate(req.getToDate());
        leaveRequest.setLeaveType(req.getLeaveType());
        leaveRequestRepo.save(leaveRequest);
    }

    @Override
    @Transactional
    public void updateLeaveReq(int leaveReqId, UpdateLeaveReq req) {
        Optional<LeaveRequest> leaveRequestOptional = leaveRequestRepo.findById(leaveReqId);
        if (!leaveRequestOptional.isPresent()) {
            throw new EntityNotFoundException("Leave Request Entity not found.");
        }
        LeaveRequest leaveRequest = leaveRequestOptional.get();
        leaveRequest.setLeaveType(req.getLeaveType());
        leaveRequest.setToDate(req.getToDate());
        leaveRequest.setFromDate(req.getFromDate());
        leaveRequest.setEmpId(req.getEmpId());
        leaveRequestRepo.save(leaveRequest);
    }

    @Override
    @Transactional
    public void deleteLeaveReq(int leaveReqId) {
        Optional<LeaveRequest> leaveRequestOptional = leaveRequestRepo.findById(leaveReqId);
        if (!leaveRequestOptional.isPresent()) {
            throw new EntityNotFoundException("Leave Request Entity not found.");
        }
        leaveRequestRepo.deleteById(leaveReqId);
    }

    @Override
    @Transactional
    public void approveLeaveReq(int leaveReqId, ApproveLeaveMetaReq req) {
        Optional<LeaveRequest> leaveRequestOptional = leaveRequestRepo.findById(leaveReqId);
        if (!leaveRequestOptional.isPresent()) {
            throw new EntityNotFoundException("Leave Request Entity not found.");
        }
        LeaveRequest leaveRequest = leaveRequestOptional.get();
        leaveRequest.setLeaveReqState(req.getLeaveReqState());
        leaveRequest.setApprovedBy(req.getLeaveProver());
        leaveRequestRepo.save(leaveRequest);
    }
}
