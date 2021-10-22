package com.devops.orderservice.controller;

import com.devops.common.exceptions.OrderNotFoundException;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.orderservice.dtos.request.OrderRequest;
import com.devops.orderservice.dtos.response.OrderResponse;
import com.devops.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        List<OrderResponse> response = orderService.getAllOrders();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<OrderResponse> createOrder(@RequestBody @Valid OrderRequest order) {
        OrderResponse response = orderService.createOrder(order);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<OrderResponse> getAOrder(@PathVariable String id) throws OrderNotFoundException, ProductNotFoundException {
        OrderResponse response = orderService.findOrderById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
