package com.devops.productservice.controller;

import com.devops.common.dtos.ServiceResponse;
import com.devops.common.dtos.product.request.ProductRequest;
import com.devops.common.dtos.product.response.ProductResponse;
import com.devops.common.dtos.response.ProductsResponse;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<ServiceResponse<List<ProductResponse>>> getAllProducts() {
        return ServiceResponse.ok(service.getAllProducts());
    }

    @GetMapping("{id}")
    public ResponseEntity<ServiceResponse<ProductResponse>> getAProduct(@PathVariable String id) throws ProductNotFoundException {
        return ServiceResponse.ok(service.findProductById(id));
    }

    @PostMapping()
    public ResponseEntity<ServiceResponse<ProductResponse>> addProduct(@RequestBody ProductRequest request) {
        return ServiceResponse.created(service.addProduct(request));
    }

//    @PostMapping("/verify")
//    public ResponseEntity<Boolean> verifyProducts(@RequestBody Set<String> ids) {
//        return new ResponseEntity<>(service. verifyProducts(ids), HttpStatus.OK);
//    }

    @PostMapping("/verify")
    public ProductsResponse getProducts(@RequestBody Set<String> ids) {
        return service.getProducts(ids);
    }
}
