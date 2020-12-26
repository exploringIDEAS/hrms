package com.ralien.erp_system.authn.dao;

import com.ralien.erp_system.authn.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
