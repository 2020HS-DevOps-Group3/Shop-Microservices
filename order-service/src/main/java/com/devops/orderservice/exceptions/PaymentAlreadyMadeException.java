package com.devops.orderservice.exceptions;

public class PaymentAlreadyMadeException extends BadRequestException {

    public PaymentAlreadyMadeException(String s) {
        super(s);
    }
}
