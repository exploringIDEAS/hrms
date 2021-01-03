package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {
}
