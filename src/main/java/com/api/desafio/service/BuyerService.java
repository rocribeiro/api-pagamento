package com.api.desafio.service;

import com.api.desafio.model.Buyer;
import com.api.desafio.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
    @Autowired
    BuyerRepository br;

    public Buyer searchCpf(String cpf){
       return br.searchCpf(cpf);
    }

}
