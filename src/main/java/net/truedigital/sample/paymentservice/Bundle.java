package net.truedigital.sample.paymentservice;

public class Bundle {
    private int discountRate;
    private List productCodes;

    public int getDiscountRate() { return discountRate; }

    public void setDiscountRate(int discountRate) { this.discountRate = discountRate; }

    public List getProductCodes() { return productCodes; }

    public void setProductCodes(List productCodes) { this.productCodes = productCodes; }
}