package com.ralien.erp_system.timesheet.dao;

import com.ralien.erp_system.timesheet.entities.EmpLeaveStock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpLeaveStockRepository extends JpaRepository<EmpLeaveStock, Integer> {
    List<EmpLeaveStock> findByEmpId(int empId);
}
