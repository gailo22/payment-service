package net.truedigital.sample.paymentservice;

public class Product {
    private BigDeciam price;
    private String productCode;
    private String productDesc;

    public BigDeciam getPrice() {
        return price;
    }

    public void setPrice(BigDeciam price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}