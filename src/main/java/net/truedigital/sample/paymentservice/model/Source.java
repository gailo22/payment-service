package net.truedigital.sample.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Source {
    private String id;
    private String name;
    private String type;
    private String channel;
}
