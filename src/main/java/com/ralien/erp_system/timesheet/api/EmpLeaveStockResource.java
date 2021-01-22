package com.ralien.erp_system.timesheet.api;

import com.ralien.erp_system.timesheet.dto.AddEmpLeaveStockReq;
import com.ralien.erp_system.timesheet.dto.UpdateEmpLeaveStockReq;
import com.ralien.erp_system.timesheet.services.IEmpLeaveStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("emp_leave_stocks")
public class EmpLeaveStockResource {
    @Autowired
    private IEmpLeaveStockService empLeaveStockService;

    @PostMapping
    public ResponseEntity<Object> addEmpLeaveStock(@Valid @RequestBody AddEmpLeaveStockReq req) {
        empLeaveStockService.addEmpLeaveStock(req);
        return new ResponseEntity<>("added", HttpStatus.CREATED);
    }

    @PutMapping("{leave_stock_id}")
    public ResponseEntity<Object> updateEmpLeaveStock(@PathVariable("leave_stock_id") int leaveStockId, @Valid @RequestBody UpdateEmpLeaveStockReq req) {
        empLeaveStockService.updateLeaveStock(leaveStockId, req);
        return new ResponseEntity<>("updated", HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<Object> getAllEmpLeaveStocks() {
        return ResponseEntity.ok(empLeaveStockService.getAllEmpLeaveStock());
    }

    @GetMapping("{emp_id}")
    public ResponseEntity<Object> getEmpLeaveStocks(@PathVariable int empId) {
        return ResponseEntity.ok(empLeaveStockService.getEmpLeaveStock(empId));
    }
}
