package com.ralien.erp_system.timesheet.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheet_office_shift")
public class OfficeShift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int startAt;
    private int hours;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date createdAt;
    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
