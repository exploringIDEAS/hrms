package com.ralien.erp_system.timesheet.services.impl;

import com.ralien.erp_system.timesheet.dao.OfficeShiftRepository;
import com.ralien.erp_system.timesheet.dto.AddOfficeShiftReq;
import com.ralien.erp_system.timesheet.dto.OfficeAllShiftResp;
import com.ralien.erp_system.timesheet.dto.OfficeShiftResp;
import com.ralien.erp_system.timesheet.dto.UpdateOfficeShiftReq;
import com.ralien.erp_system.timesheet.entities.OfficeShift;
import com.ralien.erp_system.timesheet.services.IOfficeShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class OfficeShiftServiceImpl implements IOfficeShiftService {
    @Autowired
    private OfficeShiftRepository officeShiftRepo;

    @Override
    @Transactional
    public void addNewShift(AddOfficeShiftReq req) {
        OfficeShift officeShift = new OfficeShift();
        officeShift.setTitle(req.getTitle());
        officeShift.setHours(req.getHours());
        officeShift.setStartAt(req.getStartAt());
        officeShiftRepo.save(officeShift);
    }

    @Override
    @Transactional
    public void updateOfficeShift(int shiftId, UpdateOfficeShiftReq req) {
        System.out.println("step1");
        Optional<OfficeShift> optionalOfficeShift = officeShiftRepo.findById(shiftId);
        System.out.println("step2");
        if (!optionalOfficeShift.isPresent()) {
            throw new EntityNotFoundException("office shift not found.");
        }
        System.out.println("step3");
        OfficeShift officeShift = optionalOfficeShift.get();
        System.out.println("step4");
        officeShift.setTitle(req.getTitle());
        officeShift.setStartAt(req.getStartAt());
        officeShift.setHours(req.getHours());
        System.out.println("step5");
        officeShiftRepo.save(officeShift);
        System.out.println("step6");
    }

    @Override
    public OfficeAllShiftResp getAllShifts() {
        OfficeAllShiftResp officeAllShiftResp = new OfficeAllShiftResp();
        List<OfficeShift> shifts = officeShiftRepo.findAll();
        for (OfficeShift shift: shifts) {
            OfficeShiftResp officeShiftResp = new OfficeShiftResp();
            officeShiftResp.setHours(shift.getHours());
            officeShiftResp.setStartAt(shift.getStartAt());
            officeShiftResp.setTitle(shift.getTitle());
            officeShiftResp.setShiftId(shift.getId());
            officeAllShiftResp.getShifts().add(officeShiftResp);
        }
        return officeAllShiftResp;
    }
}
