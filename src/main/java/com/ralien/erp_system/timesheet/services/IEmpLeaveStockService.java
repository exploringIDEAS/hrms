package com.ralien.erp_system.timesheet.services;

import com.ralien.erp_system.timesheet.dto.AddEmpLeaveStockReq;
import com.ralien.erp_system.timesheet.dto.EmpLeaveStockResp;
import com.ralien.erp_system.timesheet.dto.EmpLeaveStocksResp;
import com.ralien.erp_system.timesheet.dto.UpdateEmpLeaveStockReq;

public interface IEmpLeaveStockService {
    void addEmpLeaveStock(AddEmpLeaveStockReq req);
    void updateLeaveStock(int leaveStockId, UpdateEmpLeaveStockReq req);
    EmpLeaveStocksResp getAllEmpLeaveStock();
    EmpLeaveStocksResp getEmpLeaveStock(int empId);
}
