package com.devops.productservice.service;

import com.devops.common.dtos.request.ProductRequest;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.common.utils.ServiceUtils;
import com.devops.productservice.entity.Products;
import com.devops.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Products addProduct(ProductRequest request) {
        Products product = ServiceUtils.standardModelMapper(request, Products.class);
        return repository.save(product);
    }

    public Products findProductById(String id) throws ProductNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(Constants.ErrorMessages.PRODUCT_NOT_FOUND));
    }

    public Boolean verifyProducts(Set<String> ids) {
        List<Products> products = repository.findByIdIn(ids);
        return products.size() == ids.size();
    }
}
