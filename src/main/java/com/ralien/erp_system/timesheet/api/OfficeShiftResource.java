package com.ralien.erp_system.timesheet.api;

import com.ralien.erp_system.timesheet.dto.AddOfficeShiftReq;
import com.ralien.erp_system.timesheet.dto.UpdateOfficeShiftReq;
import com.ralien.erp_system.timesheet.services.IOfficeShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("office_shifts")
public class OfficeShiftResource {
    @Autowired
    private IOfficeShiftService officeShiftService;

    @PostMapping
    public ResponseEntity<Object> addNewShift(@Valid @RequestBody AddOfficeShiftReq req) {
        officeShiftService.addNewShift(req);
        return new ResponseEntity<>("added", HttpStatus.CREATED);
    }

    @PutMapping("{shift_id}")
    public ResponseEntity<Object> updateShift(@PathVariable("shift_id") int shiftId, @Valid @RequestBody UpdateOfficeShiftReq req) {
        officeShiftService.updateOfficeShift(shiftId, req);
        return new ResponseEntity<>("updated", HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<Object> getAllShifts() {
        return ResponseEntity.ok(officeShiftService.getAllShifts());
    }
}
