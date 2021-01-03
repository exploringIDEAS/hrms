package com.ralien.erp_system.employee.services.impl;

import com.ralien.erp_system.employee.dao.DeptEmpRepository;
import com.ralien.erp_system.employee.dao.DeptManagerRepository;
import com.ralien.erp_system.employee.dao.DeptRepository;
import com.ralien.erp_system.employee.dao.EmpRepository;
import com.ralien.erp_system.employee.dto.*;
import com.ralien.erp_system.employee.entities.Department;
import com.ralien.erp_system.employee.entities.DeptEmployee;
import com.ralien.erp_system.employee.entities.DeptManager;
import com.ralien.erp_system.employee.entities.composite_id.DeptEmployeeId;
import com.ralien.erp_system.employee.entities.composite_id.DeptManagerId;
import com.ralien.erp_system.employee.services.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptRepository deptRepo;

    @Autowired
    private EmpRepository empRepo;

    @Autowired
    private DeptEmpRepository deptEmpRepo;

    @Autowired
    private DeptManagerRepository deptManagerRepo;

    @Override
    @Transactional
    public void addNewDept(AddNewDepartmentReq req) {
        Department dept = new Department();
        dept.setTitle(req.getDeptTitle());
        deptRepo.save(dept);
    }

    @Override
    @Transactional
    public void addEmpInDept(AddEmpInDeptReq req) {
        checkDeptExists(req.getDeptId());
        DeptEmployee deptEmp = new DeptEmployee();
        DeptEmployeeId deptEmpId = new DeptEmployeeId(req.getDeptId(), req.getEmpId());
        deptEmp.setId(deptEmpId);
        deptEmp.setFromDate(req.getFromDate());
        deptEmpRepo.save(deptEmp);
        empRepo.updateDeptId(req.getEmpId(), req.getDeptId());
    }

    @Override
    @Transactional
    public void assignManager(AssignManagerToDept req) {
        checkDeptExists(req.getDeptId());
        DeptManager deptManager = new DeptManager();
        deptManager.setId(new DeptManagerId(req.getEmpId(), req.getDeptId()));
        deptManager.setFromDate(req.getFromDate());
        deptManagerRepo.save(deptManager);
    }

    @Override
    @Transactional
    public AllDeptResp getAllDeptList() {
        List<Department> departments = deptRepo.findAll();
        AllDeptResp resp = new AllDeptResp();
        for (Department dept: departments) {
            resp.getDepartments().add(new DeptResp(dept.getId(), dept.getTitle()));
        }
        return resp;
    }

    public void checkDeptExists(int deptId) {
        Optional<Department> department = deptRepo.findById(deptId);
        if (!department.isPresent()) {
            throw new EntityNotFoundException("Department not found.");
        }
    }
}
