package com.ralien.erp_system.timesheet.services;

import com.ralien.erp_system.timesheet.dto.AddOfficeShiftReq;
import com.ralien.erp_system.timesheet.dto.OfficeAllShiftResp;
import com.ralien.erp_system.timesheet.dto.UpdateOfficeShiftReq;

public interface IOfficeShiftService {
    void addNewShift(AddOfficeShiftReq req);
    void updateOfficeShift(int shiftId, UpdateOfficeShiftReq req);
    OfficeAllShiftResp getAllShifts();
}
