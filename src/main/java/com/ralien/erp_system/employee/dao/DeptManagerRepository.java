package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.DeptManager;
import com.ralien.erp_system.employee.entities.composite_id.DeptManagerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptManagerRepository extends JpaRepository<DeptManager, DeptManagerId> {
}
