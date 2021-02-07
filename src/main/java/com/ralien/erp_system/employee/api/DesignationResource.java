package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewDesignationReq;
import com.ralien.erp_system.employee.services.IDesignationService;
import com.ralien.erp_system.employee.services.impl.DesignationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("designations")
public class DesignationResource {
    @Autowired
    private IDesignationService designationService;

    @PostMapping
    public ResponseEntity<Object> addNewDesignation(@Valid @RequestBody AddNewDesignationReq request) {
        designationService.addNewDesignation(request);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<Object> getAllDesignations() {
        return ResponseEntity.ok(designationService.getAllDesignations());
    }
}
