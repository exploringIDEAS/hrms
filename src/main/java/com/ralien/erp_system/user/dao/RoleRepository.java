package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
