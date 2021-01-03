package com.ralien.erp_system.employee.services.impl;

import com.ralien.erp_system.employee.dao.CompensationRepository;
import com.ralien.erp_system.employee.dto.AddNewCompensationReq;
import com.ralien.erp_system.employee.dto.AllCompensationsResp;
import com.ralien.erp_system.employee.dto.CompensationResp;
import com.ralien.erp_system.employee.entities.Compensation;
import com.ralien.erp_system.employee.services.ICompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompensationServiceImpl implements ICompensationService {
    @Autowired
    private CompensationRepository compensationRepo;

    @Override
    public void addNewCompensation(AddNewCompensationReq request) {
        Compensation compensation = new Compensation();
        compensation.setBasicSalary(request.getBasicSalary());
        compensation.setBpa(request.getBpa());
        compensation.setCa(request.getCa());
        compensation.setDa(request.getDa());
        compensation.setEpf(request.getEpf());
        compensation.setGratuity(request.getGratuity());
        compensation.setHra(request.getHra());
        compensation.setLta(request.getLta());
        compensation.setMa(request.getMa());
        compensation.setPt(request.getPt());
        compensation.setPerfBonus(request.getPerfBonus());
        compensationRepo.save(compensation);
    }

    @Override
    public AllCompensationsResp getAllCompensations() {
        AllCompensationsResp allCompensationsResp = new AllCompensationsResp();
        List<Compensation> compensationList = compensationRepo.findAll();
        for (Compensation compensation: compensationList) {
            allCompensationsResp.getCompensationRespList().add(new CompensationResp(compensation));
        }
        return allCompensationsResp;
    }
}
