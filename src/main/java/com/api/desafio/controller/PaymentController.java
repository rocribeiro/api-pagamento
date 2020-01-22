package com.api.desafio.controller;

import com.api.desafio.model.Buyer;
import com.api.desafio.model.Card;
import com.api.desafio.model.Payment;
import com.api.desafio.service.BuyerService;
import com.api.desafio.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    PaymentService ps;
    @Autowired
    BuyerService bs;

    @PostMapping("/payment")
    public @ResponseBody String payment(@RequestBody Payment payment){
        Buyer buyer = bs.searchCpf(payment.getBuyer().getCpf());
        payment.setStatus("Processado");
        if(buyer != null){
            payment.setBuyer(buyer);
            payment = ps.addPayment(payment);
            return reponsePayment(payment.getType(),payment.getBoletoNumber(),payment.getCard());
        }else {
            payment = ps.addPayment(payment);
            return reponsePayment(payment.getType(),payment.getBoletoNumber(),payment.getCard());
        }
    }

    @PostMapping("/changeStatus/{id}")
    public void changeStatus(@RequestBody String status,@PathVariable Long id){
        Payment payment = ps.getPayment(id);
        payment.setStatus(status);
        ps.addPayment(payment);

    }

    @GetMapping("/status/{id}")
    public String searchStatus(@PathVariable Long id){
        return ps.getPayment(id).getStatus();
    }

    private String reponsePayment(int type, String boletoNumber, Card card) {
        if(type == 1){
            return boletoNumber;
        }else if(type ==2 && card != null){
            return "Sucesso no pagamento";
        }else {
            return "Não foi possivel realizar o pagamento";
        }

    }
}
