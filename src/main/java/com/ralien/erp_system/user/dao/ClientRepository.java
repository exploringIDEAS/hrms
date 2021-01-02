package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
