package net.truedigital.sample.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PaymentController {

    @GetMapping("/accounts/{id}/sources")
    public List<Source> getPayment(@PathVariable String id) {
        return Collections.singletonList(new Source(id));
    }

    @GetMapping("/accounts/{id}/sources/{sid}")
    public Source getSource(@PathVariable String sid) {
        return new Source(sid);
    }

    @PostMapping("/accounts/{id}/charges")
    public void charge(@PathVariable String id) {
        //TODO: to implement
    }

    @PostMapping("/accounts/{id}/sources/{sid}/verify")
    public void verifySource(@PathVariable String sid) {
        //TODO: to implement
    }
}

