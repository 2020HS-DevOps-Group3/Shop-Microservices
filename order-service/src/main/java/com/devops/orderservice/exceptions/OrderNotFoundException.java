package com.devops.orderservice.exceptions;

public class OrderNotFoundException extends BadRequestException {

    public OrderNotFoundException(String s) {
        super(s);
    }
}
