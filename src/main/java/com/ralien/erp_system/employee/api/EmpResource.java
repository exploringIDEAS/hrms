package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewEmployeeReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping("employees")
public class EmpResource {
    @PostMapping
    public ResponseEntity<String> addNewEmp(@Valid @RequestBody AddNewEmployeeReq request) {
        return null;
    }

    @GetMapping("{emp_id}")
    public ResponseEntity<String> getEmp(@NotEmpty @PathVariable int empId) {
        return null;
    }

    @GetMapping("all")
    public ResponseEntity<String> getAllEmp() {
        return null;
    }
}
