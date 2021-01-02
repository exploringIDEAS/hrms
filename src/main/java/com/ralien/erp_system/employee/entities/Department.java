package com.ralien.erp_system.employee.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    private String title;

    public short getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
