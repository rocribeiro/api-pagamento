package com.api.desafio.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    private Client client;
    private Double amount;
    private String boletoNumber;
    private int Type;
    private String status;
    @OneToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    private Buyer buyer;
    @Transient
    private Card card;

}
