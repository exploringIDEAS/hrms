package com.ralien.erp_system.authn.entities;

import java.io.Serializable;
import java.util.UUID;

public class PersonRoleId implements Serializable {
    private UUID personId;
    private int roleId;

    public PersonRoleId() {}

    public PersonRoleId(UUID personId, int roleId) {
        this.personId = personId;
        this.roleId = roleId;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roleId;
        result = prime * result + personId.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        PersonRoleId that = (PersonRoleId) obj;
        return this.personId.equals(that.personId) && this.roleId== that.roleId;
    }
}
