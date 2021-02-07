package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.EmpDesignation;
import com.ralien.erp_system.employee.entities.composite_id.EmpDesignationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDesignationRepository extends JpaRepository<EmpDesignation, EmpDesignationId> {
}
