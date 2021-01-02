package com.ralien.erp_system.employee.services;

import com.ralien.erp_system.employee.dto.AddNewDepartmentReq;
import com.ralien.erp_system.employee.dto.GetAllDeptResp;

public interface IDeptService {
    void addNewDept(AddNewDepartmentReq req);
    GetAllDeptResp getAllDeptList();
}
