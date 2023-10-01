package net.truedigital.sample.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Charge {

    private String id;
    private BigDecimal amount;
    private BigDecimal discount;
    private String status;
    private String partner;
}