package com.ralien.erp_system.employee.services;

import com.ralien.erp_system.employee.dto.*;

import java.util.UUID;

public interface IEmpService {
    void addNewEmp(AddNewEmployeeReq request);
    void updateEmp();
    EmpResp getEmpByEmpId(int empId);
    EmpResp getEmpByUserId(UUID userId);
    AllEmpResp getAllEmployees();
    void assignDesignation(AssignDesignationReq req);
    void assignCompensation(AssignCompensationReq req);
}
