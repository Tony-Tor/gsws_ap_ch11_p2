package com.example.gsws_ap_ch11_p2.controllers;

import com.example.gsws_ap_ch11_p2.FeignClient.PaymentProxy;
import com.example.gsws_ap_ch11_p2.model.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    private final PaymentProxy paymentProxy;

    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        String requestId = UUID.randomUUID().toString();
        return  paymentProxy.createPayment(requestId, payment);
    }
}
