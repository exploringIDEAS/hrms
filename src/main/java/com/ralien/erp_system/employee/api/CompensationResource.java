package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewCompensationReq;
import com.ralien.erp_system.employee.services.ICompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestControllerAdvice
@RequestMapping("compensations")
public class CompensationResource {
    @Autowired
    private ICompensationService compensationService;

    @PostMapping
    public ResponseEntity<Object> addNewCompensation(@Valid @RequestBody AddNewCompensationReq request) {
        compensationService.addNewCompensation(request);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<Object> getAllCompensations() {
        return ResponseEntity.ok(compensationService.getAllCompensations());
    }
}
