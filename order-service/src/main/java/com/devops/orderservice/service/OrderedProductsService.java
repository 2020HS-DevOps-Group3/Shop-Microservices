package com.devops.orderservice.service;

import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.orderservice.entity.OrderedProducts;
import com.devops.orderservice.repository.OrderedProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderedProductsService {

    private final OrderedProductRepository repository;

    public OrderedProducts findById(String id) throws ProductNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(Constants.ErrorMessages.PRODUCT_NOT_FOUND));
    }

    public List<OrderedProducts> findByIds(List<String> ids) {
        return repository.findByIds(ids);
    }

    public List<OrderedProducts> findAllByOrderIdIn(List<String> ids) {
        return repository.findAllByOrderIdIn(ids);
    }

    public List<OrderedProducts> findAllByOrderId(String id) {
        return repository.findAllByOrderId(id);
    }

    public void saveAll(List<OrderedProducts> products) {
        repository.saveAll(products);
    }
}
