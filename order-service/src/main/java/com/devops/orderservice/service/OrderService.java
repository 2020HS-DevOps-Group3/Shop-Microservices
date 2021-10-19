package com.devops.orderservice.service;

import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Orders createOrder(Orders order) {
        return repository.save(order);
    }
}
