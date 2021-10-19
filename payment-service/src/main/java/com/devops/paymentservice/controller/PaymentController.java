package com.devops.paymentservice.controller;

import com.devops.paymentservice.entity.Payments;
import com.devops.paymentservice.exceptions.PaymentAlreadyMadeException;
import com.devops.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public ResponseEntity<Payments> makePayment(@RequestBody Payments payment) throws PaymentAlreadyMadeException {
        Payments response = paymentService.makePayment(payment);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
