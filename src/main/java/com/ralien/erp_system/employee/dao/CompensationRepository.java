package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.Compensation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompensationRepository extends JpaRepository<Compensation, Integer> {
}
