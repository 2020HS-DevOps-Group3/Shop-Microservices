package com.devops.common.exceptions;

public class PaymentAlreadyMadeException extends BadRequestException {

    public PaymentAlreadyMadeException(String s) {
        super(s);
    }
}
