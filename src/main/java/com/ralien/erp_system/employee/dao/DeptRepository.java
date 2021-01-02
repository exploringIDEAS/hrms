package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Department, Short> {
}
