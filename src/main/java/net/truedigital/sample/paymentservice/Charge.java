package net.truedigital.sample.paymentservice;

import java.math.BigDecimal;

public class Charge {

    private String id;
    private BigDecimal amount;
    private BigDecimal discount;
    private String partner;

    public Charge(String id) {
        this.id = id;
    }

    public Charge(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }
    
    public Charge(String id, BigDecimal amount, BigDecimal discount) {
        this.id = id;
        this.amount = amount;
        this.discount = discount;
    }
    
    public Charge(String id, BigDecimal amount, BigDecimal discount, String partner) {
        this.id = id;
        this.amount = amount;
        this.discount = discount;
        this.partner = partner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() { return amount; }

    public void setAmount(BigDecimal amount) { this.amount = amount; }
    
    public BigDecimal getDiscount() { return discount; }

    public void setDiscount(BigDecimal discount) { this.discount = discount; }
    
    public String getPartner() { return partner; }

    public void setPartner(String partner) { this.partner = partner; }
}
