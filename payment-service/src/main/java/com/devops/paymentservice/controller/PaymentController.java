package com.devops.paymentservice.controller;

import com.devops.common.dtos.payment.request.PaymentRequest;
import com.devops.common.dtos.payment.response.PaymentResponse;
import com.devops.common.exceptions.PaymentAlreadyMadeException;
import com.devops.common.exceptions.PaymentNotFoundException;
import com.devops.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public ResponseEntity<PaymentResponse> makePayment(@RequestBody PaymentRequest request) throws PaymentAlreadyMadeException {
        PaymentResponse response = paymentService.makePayment(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("order/{id}")
    public ResponseEntity<PaymentResponse> getPaymentDetails(@PathVariable String id) throws PaymentNotFoundException {
        PaymentResponse response = paymentService.getPaymentsByOrderId(id);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
