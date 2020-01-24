package com.api.desafio.model;



import javax.persistence.*;

@Entity
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBoletoNumber() {
        return boletoNumber;
    }

    public void setBoletoNumber(String boletoNumber) {
        this.boletoNumber = boletoNumber;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
