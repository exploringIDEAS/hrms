package com.ralien.erp_system.authn.dao;

import com.ralien.erp_system.authn.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
