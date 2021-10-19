package com.devops.paymentservice.exceptions;

public class PaymentAlreadyMadeException extends BadRequestException {

    public PaymentAlreadyMadeException(String s) {
        super(s);
    }
}
