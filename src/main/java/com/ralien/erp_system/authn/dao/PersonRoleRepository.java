package com.ralien.erp_system.authn.dao;

import com.ralien.erp_system.authn.entities.PersonRole;
import com.ralien.erp_system.authn.entities.PersonRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface PersonRoleRepository extends JpaRepository<PersonRole, PersonRoleId> {
    List<PersonRole> findByRoleId(int roleId);
    @Query("from PersonRole where roleId IN (?1)")
    List<PersonRole> findByRoleIds(Set<Integer> roleIds);

    @Modifying
    @Query("delete PersonRole where personId in (?1) and roleId = ?2")
    void deleteMappingsByRoleId(List<UUID> personIds, int roleId);

    @Modifying
    @Query("delete PersonRole where personId in (?1) and roleId IN (?2)")
    void deleteMappingsByRoleIds(List<UUID> personIds, Set<Integer> roleIds);
}
