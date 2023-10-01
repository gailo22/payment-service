package net.truedigital.sample.paymentservice.controller;

import net.truedigital.sample.paymentservice.model.Charge;
import net.truedigital.sample.paymentservice.model.Payment;
import net.truedigital.sample.paymentservice.model.Source;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class PaymentController {

    @GetMapping("/accounts/{id}/payments")
    public List<Payment> getPayment(@PathVariable String id) {
        return Collections.singletonList(Payment.builder().id(id).name("defaultPaymentName").build());
    }

    @GetMapping("/accounts/{id}/sources/{sid}")
    public Source getSource(@PathVariable String sid) {
        return Source.builder().id(sid).build();
    }

    @PatchMapping("/accounts/{id}/sources/{sid}")
    public Source patchSource(@PathVariable String sid) {
        return Source.builder().id(sid).build();
    }

    @DeleteMapping("/accounts/{id}/sources/{sid}")
    public Source deleteSource(@PathVariable String sid) {
        return Source.builder().id(sid).build();
    }

    @PostMapping("/accounts/{id}/sources/{sid}/verify")
    public void verifySource(@PathVariable String sid) {
        //TODO: to implement
    }

    @PatchMapping("/accounts/{id}/sources/{sid}/verify")
    public void patchVerifySource(@PathVariable String sid) {
        //TODO: to implement
    }

    @PostMapping("/accounts/{id}/charges")
    public void charge(@PathVariable String id) {
        //TODO: to implement
    }

    @GetMapping("/accounts/{id}/charges/{cid}")
    public Charge getCharge(@PathVariable String cid) {
        //TODO: to implement
        return Charge.builder().id(cid).build();
    }


}

