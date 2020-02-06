package com.api.desafio.controller;

import com.api.desafio.model.Buyer;
import com.api.desafio.model.Card;
import com.api.desafio.model.Payment;
import com.api.desafio.service.BuyerService;
import com.api.desafio.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @Autowired
    BuyerService buyerService;

    @PostMapping("/payment")
    public @ResponseBody String payment(@RequestBody Payment payment){
        Buyer buyer = buyerService.searchCpf(payment.getBuyer().getCpf());
        payment.setStatus("Processado");
        if(buyer != null){
            payment.setBuyer(buyer);
            payment = paymentService.addPayment(payment);
            return reponsePayment(payment.getType(),payment.getBoletoNumber(),payment.getCard());
        }else {
            payment = paymentService.addPayment(payment);
            return reponsePayment(payment.getType(),payment.getBoletoNumber(),payment.getCard());
        }
    }

    @PostMapping("/changeStatus/{id}")
    public void changeStatus(@RequestBody String status,@PathVariable Long id){
        Payment payment = paymentService.getPayment(id);
        payment.setStatus(status);
        paymentService.addPayment(payment);

    }

    @GetMapping("/status/{id}")
    public String searchStatus(@PathVariable Long id){
        return paymentService.getPayment(id).getStatus();
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
