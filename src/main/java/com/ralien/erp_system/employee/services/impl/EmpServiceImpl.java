package com.ralien.erp_system.employee.services.impl;

import com.ralien.erp_system.employee.dao.*;
import com.ralien.erp_system.employee.dto.*;
import com.ralien.erp_system.employee.entities.*;
import com.ralien.erp_system.employee.entities.composite_id.EmpCompensationId;
import com.ralien.erp_system.employee.entities.composite_id.EmpDesignationId;
import com.ralien.erp_system.employee.services.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private DesignationRepository designationRepo;

    @Autowired
    private CompensationRepository compensationRepo;

    @Autowired
    private EmpRepository empRepo;

    @Autowired
    private EmpCompensationRepository empCompensationRepo;

    @Autowired
    private EmpDesignationRepository empDesignationRepo;

    @Override
    @Transactional
    public void addNewEmp(AddNewEmployeeReq request) {
        Employee emp = new Employee();
        emp.setUserId(request.getUserId());
        emp.setBirthDate(request.getBirthDate());
        emp.setFirstName(request.getFirstName());
        emp.setLastName(request.getLastName());
        emp.setGender(request.getGender());
        emp.setEmail(request.getEmail());
        emp.setHireDate(request.getHireDate());
        emp.setMobile(request.getMobile());
        emp.setAltMobile(request.getAltMobile());
        emp.setCurrAddress(request.getCurrAddress());
        emp.setPermAddress(request.getPermAddress());
        empRepo.save(emp);
    }

    @Override
    public void updateEmp() {

    }

    @Override
    public EmpResp getEmpByEmpId(int empId) {
        Optional<Employee> emp = empRepo.findById(empId);
        if (!emp.isPresent()) {
            throw new EntityNotFoundException("Employee not found.");
        }
        return new EmpResp(emp.get());
    }

    @Override
    public EmpResp getEmpByUserId(UUID userId) {
        return new EmpResp(empRepo.findByUserId(userId));
    }

    @Override
    public AllEmpResp getAllEmployees() {
        AllEmpResp allEmpResp = new AllEmpResp();
        List<Employee> employeeList = empRepo.findAll();
        for (Employee emp: employeeList) {
            allEmpResp.getEmpRespList().add(new EmpResp(emp));
        }
        return allEmpResp;
    }

    @Override
    @Transactional
    public void assignDesignation(AssignDesignationReq req) {
        Optional<Designation> designation = designationRepo.findById(req.getDesignationId());
        if (!designation.isPresent()) {
            throw new EntityNotFoundException("Designation not found.");
        }
        EmpDesignation empDesignation = new EmpDesignation();
        empDesignation.setId(new EmpDesignationId(req.getEmpId(), req.getDesignationId()));
        empDesignation.setFromDate(req.getFromDate());
        empDesignationRepo.save(empDesignation);
        empRepo.updateDesignationId(req.getEmpId(), req.getDesignationId());
    }

    @Override
    @Transactional
    public void assignCompensation(AssignCompensationReq req) {
        Optional<Compensation> compensation = compensationRepo.findById(req.getCompensationId());
        if (!compensation.isPresent()) {
            throw new EntityNotFoundException("Compensation not found.");
        }
        EmpCompensation empCompensation = new EmpCompensation();
        empCompensation.setId(new EmpCompensationId(req.getEmpId(), req.getCompensationId()));
        empCompensation.setFromDate(req.getFromDate());
        empCompensationRepo.save(empCompensation);
        empRepo.updateCompensationId(req.getEmpId(), req.getCompensationId());
    }
}
