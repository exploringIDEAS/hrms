package com.ralien.erp_system.timesheet.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheet_holiday_calendar")
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date holidayDate;
    private String description;
    private boolean optional;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date createdAt;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
