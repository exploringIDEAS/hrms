package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
