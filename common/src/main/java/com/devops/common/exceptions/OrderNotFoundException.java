package com.devops.common.exceptions;

public class OrderNotFoundException extends BadRequestException {

    public OrderNotFoundException(String s) {
        super(s);
    }
}
