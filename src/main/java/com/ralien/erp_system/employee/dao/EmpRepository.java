package com.ralien.erp_system.employee.dao;

import com.ralien.erp_system.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
    Employee findByUserId(UUID userId);
    @Modifying
    @Query("update Employee e set e.department.id = ?2 where e.id = ?1")
    void updateDeptId(int empId, int deptId);
    @Modifying
    @Query("update Employee e set e.designation.id = ?2 where e.id = ?1")
    void updateDesignationId(int empId, int designationId);
    @Modifying
    @Query("update Employee e set e.compensation.id = ?2 where e.id = ?1")
    void updateCompensationId(int empId, int compensationId);
}
