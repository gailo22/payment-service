package net.truedigital.sample.paymentservice;

import java.math.BigDecimal;

public class Charge {

    private String id;
    private BigDecimal amount;

    public Charge(String id) {
        this.id = id;
    }

    public Charge(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() { return amount; }

    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
