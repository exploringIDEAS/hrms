package com.ralien.erp_system.employee.services;

import com.ralien.erp_system.employee.dto.AddNewDesignationReq;
import com.ralien.erp_system.employee.dto.AllDesignationResp;

public interface IDesignationService {
    void addNewDesignation(AddNewDesignationReq req);
    AllDesignationResp getAllDesignations();
}
