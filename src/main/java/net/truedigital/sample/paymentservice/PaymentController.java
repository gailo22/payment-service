package net.truedigital.sample.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PaymentController {

    @GetMapping("/accounts/{id}/payments")
    public List<Payment> getPayment(@PathVariable String id) {
        return Collections.singletonList(new Payment(id, name));
    }

    @GetMapping("/accounts/{id}/sources/{sid}")
    public Source getSource(@PathVariable String sid) {
        return new Source(sid, name);
    }
}

