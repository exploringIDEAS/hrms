package com.ralien.erp_system.authn.dao;

import com.ralien.erp_system.authn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
