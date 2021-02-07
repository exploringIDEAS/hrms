package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.PersonRole;
import com.ralien.erp_system.user.entities.composite_id.PersonRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface PersonRoleRepository extends JpaRepository<PersonRole, PersonRoleId> {
    @Query("from PersonRole t where t.id.roleId = ?1")
    List<PersonRole> findByRoleId(int roleId);
    @Query("from PersonRole t where t.id.roleId IN (?1)")
    List<PersonRole> findByRoleIds(Set<Integer> roleIds);

    @Modifying
    @Query("delete PersonRole t where t.id.personId in (?1) and t.id.roleId = ?2")
    void deleteMappingsByRoleId(List<UUID> personIds, int roleId);

    @Modifying
    @Query("delete PersonRole t where t.id.personId in (?1) and t.id.roleId IN (?2)")
    void deleteMappingsByRoleIds(List<UUID> personIds, Set<Integer> roleIds);
}
