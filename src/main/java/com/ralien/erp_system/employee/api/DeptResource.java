package com.ralien.erp_system.employee.api;

import com.ralien.erp_system.employee.dto.AddNewDepartmentReq;
import com.ralien.erp_system.employee.services.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/departments")
public class DeptResource {

    @Autowired
    private DeptServiceImpl deptService;

    @PostMapping
    public ResponseEntity<String> addNewDept(@Valid @RequestBody AddNewDepartmentReq request) throws URISyntaxException {
        deptService.addNewDept(request);
        return ResponseEntity.created(new URI("")).body("created");
    }

    @GetMapping("all")
    public ResponseEntity<String> getAllDept() {
        return null;
    }
}
