package net.truedigital.sample.paymentservice;

import java.math.BigDecimal;

public class Payment {
    private String id;
    private String name;
    private BigDecimal amount;
    private BigDecimal discount;

    Payment(String id) {
        this.id = id;
    }

    Payment(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Payment(String id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    
    Payment(String id, String name, BigDecimal amount, BigDecimal discount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() { return amount; }

    public void setAmount(BigDecimal amount) { this.amount = amount; }
    
    public BigDecimal getDiscount() { return discount; }

    public void setDiscount(BigDecimal discount) { this.discount = discount; }
}
