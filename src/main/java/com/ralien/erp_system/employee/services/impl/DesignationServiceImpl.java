package com.ralien.erp_system.employee.services.impl;

import com.ralien.erp_system.employee.dao.DesignationRepository;
import com.ralien.erp_system.employee.dto.AddNewDesignationReq;
import com.ralien.erp_system.employee.dto.AllDesignationResp;
import com.ralien.erp_system.employee.dto.DesignationResp;
import com.ralien.erp_system.employee.entities.Designation;
import com.ralien.erp_system.employee.services.IDesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class DesignationServiceImpl implements IDesignationService {
    @Autowired
    private DesignationRepository designationRepo;

    @Override
    @Transactional
    public void addNewDesignation(AddNewDesignationReq req) {
        Designation designation = new Designation();
        designation.setTitle(req.getDesignationTitle());
        designation.setGrade(req.getGrade());
        designationRepo.save(designation);
    }

    @Override
    public AllDesignationResp getAllDesignations() {
        List<Designation> designationList = designationRepo.findAll();
        AllDesignationResp allDesignationResp = new AllDesignationResp();
        for (Designation designation: designationList) {
            allDesignationResp.getDesignations().add(new DesignationResp(designation.getId(), designation.getTitle(), designation.getGrade()));
        }
        return allDesignationResp;
    }
}
