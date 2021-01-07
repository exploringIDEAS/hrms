package com.ralien.erp_system.timesheet.dao;

import com.ralien.erp_system.timesheet.entities.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
    @Modifying
    @Query("delete from LeaveRequest where id=?1")
    public void deleteById(int leaveReqId);
}
