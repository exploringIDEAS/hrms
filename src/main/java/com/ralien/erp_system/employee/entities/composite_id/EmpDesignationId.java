package com.ralien.erp_system.employee.entities.composite_id;

import java.io.Serializable;

public class EmpDesignationId implements Serializable {
    private int empId;
    private short designationId;

    public EmpDesignationId() {}

    public EmpDesignationId(int empId, short designationId) {
        this.empId = empId;
        this.designationId = designationId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public short getDesignationId() {
        return designationId;
    }

    public void setDesignationId(short designationId) {
        this.designationId = designationId;
    }
}
