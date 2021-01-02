package com.ralien.erp_system.user.entities.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class PersonRoleId implements Serializable {
    @Column(name = "person_id")
    private UUID personId;
    @Column(name = "role_id")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonRoleId)) return false;
        PersonRoleId that = (PersonRoleId) o;
        return roleId == that.roleId &&
                Objects.equals(personId, that.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, roleId);
    }
}
