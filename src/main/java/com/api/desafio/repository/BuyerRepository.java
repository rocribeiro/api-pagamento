package com.api.desafio.repository;

import com.api.desafio.model.Buyer;
import com.api.desafio.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Long> {
    @Query(value="SELECT * FROM buyer p WHERE p.cpf = :cpf",nativeQuery=true)
    public Buyer searchCpf(@Param("cpf") String cpf);
}
