package com.ralien.erp_system.employee.services;

import com.ralien.erp_system.employee.dto.AddEmpInDeptReq;
import com.ralien.erp_system.employee.dto.AddNewDepartmentReq;
import com.ralien.erp_system.employee.dto.AllDeptResp;
import com.ralien.erp_system.employee.dto.AssignManagerToDept;

public interface IDeptService {
    void addNewDept(AddNewDepartmentReq req);
    AllDeptResp getAllDeptList();
    void addEmpInDept(AddEmpInDeptReq req);
    void assignManager(AssignManagerToDept req);
}
