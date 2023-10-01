package net.truedigital.sample.paymentservice.service;

import net.truedigital.sample.paymentservice.model.Bundle;
import net.truedigital.sample.paymentservice.model.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class BundleCalculator {
    private List<Bundle> bundles;

    public BundleCalculator(List<Bundle> bundles) {
        this.bundles = bundles;
    }

    public BigDecimal calculateTotalPrice(List<Product> products) {
        Map<String, Product> productSet = new HashMap<String, Product>();
        
        for (Product product : products) {
            productSet.put(product.getProductCode(), product);
        }

        BigDecimal discountAmount = new BigDecimal(0);
        for (Bundle bundle : this.bundles) {
            Set<String> bundleProductCodeSet = new HashSet<String>(bundle.getProductCodes());

            if (productSet.keySet().containsAll(bundleProductCodeSet)) {
                for (String code: bundleProductCodeSet) {
                    BigDecimal discount = productSet.get(code).getPrice()
                        .multiply(new BigDecimal(bundle.getDiscountRate()))
                        .divide(BigDecimal.valueOf(100));
                    discountAmount = discountAmount.add(discount);
                    // once discounted, no applicable for other bundle rule
                    productSet.remove(code);
                }
            }
        }
        BigDecimal total = BigDecimal.valueOf(0);
        for (Product product : products) {
            total = total.add(product.getPrice());
        }

        return total.subtract(discountAmount);
    }
}