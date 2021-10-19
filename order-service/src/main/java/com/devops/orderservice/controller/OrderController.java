package com.devops.orderservice.controller;

import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping()
    public ResponseEntity<Orders> order(@RequestBody Orders order) {
        Orders response = orderService.createOrder(order);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
