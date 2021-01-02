package com.ralien.erp_system.employee.services.impl;

import com.ralien.erp_system.employee.dao.DeptRepository;
import com.ralien.erp_system.employee.dto.AddNewDepartmentReq;
import com.ralien.erp_system.employee.dto.GetAllDeptResp;
import com.ralien.erp_system.employee.dto.GetDeptResp;
import com.ralien.erp_system.employee.entities.Department;
import com.ralien.erp_system.employee.services.IDeptService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptRepository deptRepo;

    @Override
    @Transactional
    public void addNewDept(AddNewDepartmentReq req) {
        Department dept = new Department();
        dept.setTitle(req.getDeptTitle());
        deptRepo.save(dept);
    }

    @Override
    @Transactional
    public GetAllDeptResp getAllDeptList() {
        List<Department> departments = deptRepo.findAll();
        GetAllDeptResp resp = new GetAllDeptResp();
        for (Department dept: departments) {
            resp.getDepartments().add(new GetDeptResp(dept.getId(), dept.getTitle()));
        }
        return resp;
    }
}
