package com.devops.productservice.exceptions;

public class ProductNotFoundException extends NotFoundException {

    public ProductNotFoundException(String s) {
        super(s);
    }
}
