package com.ralien.erp_system.employee.entities.composite_id;

import com.ralien.erp_system.employee.entities.EmpCompensation;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmpCompensationId implements Serializable {
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "compensation_id")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpCompensationId)) return false;
        EmpCompensationId that = (EmpCompensationId) o;
        return empId == that.empId &&
                compensationId == that.compensationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, compensationId);
    }
}
