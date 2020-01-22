package com.api.desafio;

import com.api.desafio.model.Buyer;
import com.api.desafio.service.BuyerService;
import com.api.desafio.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesafioApplicationTests {
	@Autowired
	PaymentService ps;
	@Autowired
	BuyerService bs;


}
