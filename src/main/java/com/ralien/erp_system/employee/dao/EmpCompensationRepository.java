package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.EmpCompensation;
import com.ralien.erp_system.employee.entities.composite_id.EmpCompensationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpCompensationRepository extends JpaRepository<EmpCompensation, EmpCompensationId> {
}
