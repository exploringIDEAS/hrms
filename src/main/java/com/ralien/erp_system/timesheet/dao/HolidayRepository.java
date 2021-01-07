package com.ralien.erp_system.timesheet.dao;

import com.ralien.erp_system.timesheet.entities.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {
    @Query("from Holiday t where year(t.holidayDate) = ?1")
    List<Holiday> getAllHolidaysOfYear(int year);
}
