package net.truedigital.sample.paymentservice.controller;

import net.truedigital.sample.paymentservice.model.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PaymentControllerTest {

    @InjectMocks
    private PaymentController paymentController;
    @Test
    public void getPayment() {
        List<Payment> actual = paymentController.getPayment("1");
        assertEquals("1", actual.get(0).getId());
    }
}