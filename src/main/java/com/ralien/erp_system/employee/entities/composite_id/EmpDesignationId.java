package com.ralien.erp_system.employee.entities.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmpDesignationId implements Serializable {
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "designation_id")
    private int designationId;

    public EmpDesignationId() {}

    public EmpDesignationId(int empId, int designationId) {
        this.empId = empId;
        this.designationId = designationId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpDesignationId)) return false;
        EmpDesignationId that = (EmpDesignationId) o;
        return empId == that.empId &&
                designationId == that.designationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, designationId);
    }
}
