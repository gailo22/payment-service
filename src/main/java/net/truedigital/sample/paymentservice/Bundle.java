package net.truedigital.sample.paymentservice;

import java.util.List;

public class Bundle {
    private int discountRate;
    private List<String> productCodes;

    public int getDiscountRate() { return discountRate; }

    public void setDiscountRate(int discountRate) { this.discountRate = discountRate; }

    public List<String> getProductCodes() { return productCodes; }

    public void setProductCodes(List<String> productCodes) { this.productCodes = productCodes; }
}