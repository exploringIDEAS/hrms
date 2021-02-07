package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewEmployeeReq;
import com.ralien.erp_system.employee.dto.AssignCompensationReq;
import com.ralien.erp_system.employee.dto.AssignDesignationReq;
import com.ralien.erp_system.employee.services.IEmpService;
import com.ralien.erp_system.employee.services.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@RestController
@RequestMapping("employees")
public class EmpResource {
    @Autowired
    private IEmpService empService;

    @PostMapping
    public ResponseEntity<String> addNewEmp(@Valid @RequestBody AddNewEmployeeReq request) {
        empService.addNewEmp(request);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }

    @GetMapping("{emp_id}")
    public ResponseEntity<Object> getEmp(@NotEmpty @PathVariable("emp_id") int empId) {
        return ResponseEntity.ok(empService.getEmpByEmpId(empId));
    }

    @GetMapping("user/{user_id}")
    public ResponseEntity<Object> getEmpByUserId(@NotEmpty @PathVariable("user_id") UUID userId) {
        return ResponseEntity.ok(empService.getEmpByUserId(userId));
    }

    @GetMapping("all")
    public ResponseEntity<Object> getAllEmp() {
        return ResponseEntity.ok(empService.getAllEmployees());
    }

    @PostMapping("designation")
    public ResponseEntity<Object> assignDesignation(@Valid @RequestBody AssignDesignationReq req) {
        empService.assignDesignation(req);
        return new ResponseEntity<>("assigned", HttpStatus.CREATED);
    }

    @PostMapping("compensation")
    public ResponseEntity<Object> assignCompensation(@Valid @RequestBody AssignCompensationReq req) {
        empService.assignCompensation(req);
        return new ResponseEntity<>("assigned", HttpStatus.CREATED);
    }
}
