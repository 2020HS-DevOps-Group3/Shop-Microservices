package com.devops.common.exceptions;

public class ProductNotFoundException extends BadRequestException {

    public ProductNotFoundException(String s) {
        super(s);
    }
}
