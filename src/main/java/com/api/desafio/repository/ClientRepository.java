package com.api.desafio.repository;

import com.api.desafio.model.Client;
import com.api.desafio.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
