package net.truedigital.sample.paymentservice;

import java.math.BigDecimal;

public class Payment {
    private String id;
    private String name;
    private BigDecimal amount;

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
}
