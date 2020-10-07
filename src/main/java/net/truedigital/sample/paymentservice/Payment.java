package net.truedigital.sample.paymentservice;

public class Payment {
    private String id;

    Payment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
