package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.DeptEmployee;
import com.ralien.erp_system.employee.entities.composite_id.DeptEmployeeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptEmpRepository extends JpaRepository<DeptEmployee, DeptEmployeeId> {
}
