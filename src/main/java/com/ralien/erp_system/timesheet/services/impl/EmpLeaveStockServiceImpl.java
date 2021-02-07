package com.ralien.erp_system.timesheet.services.impl;

import com.ralien.erp_system.timesheet.dao.EmpLeaveStockRepository;
import com.ralien.erp_system.timesheet.dto.AddEmpLeaveStockReq;
import com.ralien.erp_system.timesheet.dto.EmpLeaveStockResp;
import com.ralien.erp_system.timesheet.dto.EmpLeaveStocksResp;
import com.ralien.erp_system.timesheet.dto.UpdateEmpLeaveStockReq;
import com.ralien.erp_system.timesheet.entities.EmpLeaveStock;
import com.ralien.erp_system.timesheet.services.IEmpLeaveStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class EmpLeaveStockServiceImpl implements IEmpLeaveStockService {
    @Autowired
    private EmpLeaveStockRepository empLeaveStockRepo;

    @Override
    @Transactional
    public void addEmpLeaveStock(AddEmpLeaveStockReq req) {
        EmpLeaveStock empLeaveStock = new EmpLeaveStock();
        empLeaveStock.setEmpId(req.getEmpId());
        empLeaveStock.setSickLeave(req.getSickLeave());
        empLeaveStock.setCasualLeave(req.getCasualLeave());
        empLeaveStock.setEarnedLeave(req.getEarnedLeave());
        empLeaveStock.setMaternityLeave(req.getMaternityLeave());
        empLeaveStock.setPaternityLeave(req.getPaternityLeave());
        empLeaveStock.setCalendarStartDate(req.getCalendarStartDate());
        empLeaveStock.setCalendarEndDate(req.getCalendarEndDate());
        empLeaveStockRepo.save(empLeaveStock);
    }

    @Override
    @Transactional
    public void updateLeaveStock(int leaveStockId, UpdateEmpLeaveStockReq req) {
        Optional<EmpLeaveStock> empLeaveStockOptional = empLeaveStockRepo.findById(leaveStockId);
        if (!empLeaveStockOptional.isPresent()) {
            throw new EntityNotFoundException("leave stock entity not found.");
        }
        EmpLeaveStock empLeaveStock = empLeaveStockOptional.get();
        empLeaveStock.setEmpId(req.getEmpId());
        empLeaveStock.setSickLeave(req.getSickLeave());
        empLeaveStock.setCasualLeave(req.getCasualLeave());
        empLeaveStock.setEarnedLeave(req.getEarnedLeave());
        empLeaveStock.setMaternityLeave(req.getMaternityLeave());
        empLeaveStock.setPaternityLeave(req.getPaternityLeave());
        empLeaveStock.setCalendarStartDate(req.getCalendarStartDate());
        empLeaveStock.setCalendarEndDate(req.getCalendarEndDate());
        empLeaveStockRepo.save(empLeaveStock);
    }

    @Override
    public EmpLeaveStocksResp getAllEmpLeaveStock() {
        EmpLeaveStocksResp empLeaveStocksResp = new EmpLeaveStocksResp();
        List<EmpLeaveStock> empLeaveStocks = empLeaveStockRepo.findAll();
        for (EmpLeaveStock leaveStock: empLeaveStocks) {
            empLeaveStocksResp.getStocks().add(convertLeaveStockEntityToLeaveStockResp(leaveStock));
        }
        return empLeaveStocksResp;
    }

    @Override
    public EmpLeaveStocksResp getEmpLeaveStock(int empId) {
        EmpLeaveStocksResp empLeaveStocksResp = new EmpLeaveStocksResp();
        List<EmpLeaveStock> empLeaveStocks = empLeaveStockRepo.findByEmpId(empId);
        for (EmpLeaveStock leaveStock: empLeaveStocks) {
            empLeaveStocksResp.getStocks().add(convertLeaveStockEntityToLeaveStockResp(leaveStock));
        }
        return empLeaveStocksResp;
    }

    public EmpLeaveStockResp convertLeaveStockEntityToLeaveStockResp(EmpLeaveStock empLeaveStock) {
        EmpLeaveStockResp empLeaveStockResp = new EmpLeaveStockResp();
        empLeaveStockResp.setLeaveStockId(empLeaveStock.getId());
        empLeaveStockResp.setCalendarEndDate(empLeaveStock.getCalendarEndDate());
        empLeaveStockResp.setCalendarStartDate(empLeaveStock.getCalendarStartDate());
        empLeaveStockResp.setCasualLeave(empLeaveStock.getCasualLeave());
        empLeaveStockResp.setSickLeave(empLeaveStock.getSickLeave());
        empLeaveStockResp.setEarnedLeave(empLeaveStock.getEarnedLeave());
        empLeaveStockResp.setMaternityLeave(empLeaveStock.getMaternityLeave());
        empLeaveStockResp.setPaternityLeave(empLeaveStock.getPaternityLeave());
        empLeaveStockResp.setEmpId(empLeaveStock.getEmpId());
        return empLeaveStockResp;
    }
}
