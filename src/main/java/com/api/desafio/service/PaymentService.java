package com.api.desafio.service;

import com.api.desafio.model.Buyer;
import com.api.desafio.model.Payment;
import com.api.desafio.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment getPayment(Long id){
        return paymentRepository.getOne(id);
    }

    public Payment addPayment(Payment payment){
        if(payment.getType() == 1){
            UUID boletoNumber = UUID.randomUUID();
            payment.setBoletoNumber(boletoNumber.toString());
            return  paymentRepository.save(payment);
        }else{
            return  paymentRepository.save(payment);
        }
    }


}
