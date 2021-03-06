package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
    Person findByUsername(String username);
    @Modifying
    @Query("update Person p set p.active = false where p.id = ?1")
    void markPersonIdDeactivated(UUID personId);
    @Modifying
    @Query("update Person p set p.active = true where p.id = ?1")
    void markPersonIdActivated(UUID personId);
}
