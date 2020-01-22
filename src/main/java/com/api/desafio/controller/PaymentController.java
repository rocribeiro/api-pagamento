package com.api.desafio.controller;

import com.api.desafio.model.Buyer;
import com.api.desafio.model.Payment;
import com.api.desafio.service.BuyerService;
import com.api.desafio.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/payment")
    public String payment(@RequestBody Payment payment, @RequestBody Buyer buyer){

            return null;
        }
}
