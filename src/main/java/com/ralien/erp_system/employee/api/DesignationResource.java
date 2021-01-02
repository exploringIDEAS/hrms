package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewDesignationReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("designations")
public class DesignationResource {
    @PostMapping
    public ResponseEntity<String> addNewDesignation(@Valid @RequestBody AddNewDesignationReq request) {
        return null;
    }

    @GetMapping("all")
    public ResponseEntity<String> getAllDesignations() {
        return null;
    }
}
