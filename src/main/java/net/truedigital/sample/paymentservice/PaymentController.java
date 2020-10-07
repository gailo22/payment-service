package net.truedigital.sample.paymentservice;

import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/accounts/{id}/sources/{sid}")
    public Source patchSource(@PathVariable String sid) {
        return new Source(sid);
    }

    @DeleteMapping("/accounts/{id}/sources/{sid}")
    public Source deleteSource(@PathVariable String sid) {
        return new Source(sid);
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
        return new Charge(cid);
    }


}

