package com.ralien.erp_system.employee.entities.composite_id;

import com.ralien.erp_system.employee.entities.EmpCompensation;

import java.io.Serializable;

public class EmpCompensationId implements Serializable {
    private int empId;
    private short compensationId;

    public EmpCompensationId() {}

    public EmpCompensationId(int empId, short compensationId) {
        this.empId = empId;
        this.compensationId = compensationId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public short getCompensationId() {
        return compensationId;
    }

    public void setCompensationId(short compensationId) {
        this.compensationId = compensationId;
    }
}
