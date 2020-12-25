package com.ralien.erp_system.authn;

import com.ralien.erp_system.authn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
