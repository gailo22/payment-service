package net.truedigital.sample.paymentservice;

public class Charge {

    private String id;

    public Charge(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
