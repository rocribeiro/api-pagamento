package com.api.desafio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double Amount;
    private String boletoNumber;
    private int Type;
    private String status;
    @OneToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    private Buyer buyer;
    @Transient
    private Card card;

}
