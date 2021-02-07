package com.ralien.erp_system.employee.services;

import com.ralien.erp_system.employee.dto.AddNewCompensationReq;
import com.ralien.erp_system.employee.dto.AllCompensationsResp;

public interface ICompensationService {
    void addNewCompensation(AddNewCompensationReq request);
    AllCompensationsResp getAllCompensations();
}
