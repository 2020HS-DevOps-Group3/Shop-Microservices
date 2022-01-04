package com.devops.productservice.service;

import com.devops.common.dtos.product.request.ProductRequest;
import com.devops.common.dtos.product.response.ProductResponse;
import com.devops.common.dtos.response.ProductsResponse;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.common.utils.ServiceUtils;
import com.devops.productservice.entity.Products;
import com.devops.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<ProductResponse> getAllProducts() {
        List<Products> productsList = repository.findAll();
        return ServiceUtils.standardModelsMappers(productsList, ProductResponse.class);
    }

    public ProductResponse addProduct(ProductRequest request) {
        Products product = ServiceUtils.standardModelMapper(request, Products.class);
        Products savedProduct = repository.save(product);
        return ServiceUtils.standardModelMapper(savedProduct, ProductResponse.class);
    }

    public ProductResponse findProductById(String id) throws ProductNotFoundException {
        Products product = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(Constants.ErrorMessages.PRODUCT_NOT_FOUND));
        return ServiceUtils.standardModelMapper(product, ProductResponse.class);
    }

    public Boolean verifyProducts(Set<String> ids) {
        List<Products> products = repository.findByIdIn(ids);
        return products.size() == ids.size();
    }

    public ProductsResponse getProducts(Set<String> ids) {
        final List<Products> products = repository.findByIdIn(ids);
        Set<ProductResponse> productResponses = new HashSet<>(ServiceUtils.standardModelsMappers(products, ProductResponse.class));
        ProductsResponse response = new ProductsResponse();
        response.setProductResponseSet(productResponses);
        return response;
    }

    public void insertProduct(String id, String name, String imageUrl, String description, int qty, double price) {
        repository.insertProduct(id, name, imageUrl, description, qty, price);
    }
}
