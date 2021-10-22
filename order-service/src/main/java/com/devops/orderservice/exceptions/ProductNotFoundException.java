package com.devops.orderservice.exceptions;

public class ProductNotFoundException extends BadRequestException {

    public ProductNotFoundException(String s) {
        super(s);
    }
}
