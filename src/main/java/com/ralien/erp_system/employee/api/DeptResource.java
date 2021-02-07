package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddEmpInDeptReq;
import com.ralien.erp_system.employee.dto.AddNewDepartmentReq;
import com.ralien.erp_system.employee.services.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/departments")
public class DeptResource {

    @Autowired
    private IDeptService deptService;

    @PostMapping
    public ResponseEntity<Object> addNewDept(@Valid @RequestBody AddNewDepartmentReq request) {
        deptService.addNewDept(request);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<Object> getAllDept() {
        return ResponseEntity.ok(deptService.getAllDeptList());
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> addNewEmployee(@Valid @RequestBody AddEmpInDeptReq req) {
        deptService.addEmpInDept(req);
        return new ResponseEntity<>("added", HttpStatus.CREATED);
    }
}
