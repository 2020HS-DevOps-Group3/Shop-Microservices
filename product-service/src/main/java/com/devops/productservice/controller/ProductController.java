package com.devops.productservice.controller;

import com.devops.common.dtos.request.ProductRequest;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.productservice.entity.Products;
import com.devops.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping()
    public ResponseEntity<List<Products>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Products> getAProduct(@PathVariable String id) throws ProductNotFoundException {
        return new ResponseEntity<>(service.findProductById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Products> addProduct(@RequestBody ProductRequest request) {
        return new ResponseEntity<>(service.addProduct(request), HttpStatus.CREATED);
    }

    @PostMapping("/verify")
    public ResponseEntity<Boolean> verifyProducts(@RequestBody Set<String> ids) {
        return new ResponseEntity<>(service.verifyProducts(ids), HttpStatus.OK);
    }
}
