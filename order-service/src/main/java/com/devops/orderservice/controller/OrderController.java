package com.devops.orderservice.controller;

import com.devops.common.dtos.ServiceResponse;
import com.devops.common.dtos.request.OrderRequest;
import com.devops.common.dtos.response.OrderResponse;
import com.devops.common.exceptions.OrderNotFoundException;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<ServiceResponse<List<OrderResponse>>> getAllOrders() {
        List<OrderResponse> response = orderService.getAllOrders();
        return ServiceResponse.ok(response);
    }

    @PostMapping()
    public ResponseEntity<ServiceResponse<OrderResponse>> createOrder(@RequestBody @Valid OrderRequest order) throws ProductNotFoundException {
        OrderResponse response = orderService.createOrder(order);
        return ServiceResponse.created(response);
    }

    @GetMapping("{id}")
    public ResponseEntity<ServiceResponse<OrderResponse>> getAOrder(@PathVariable String id) throws OrderNotFoundException, ProductNotFoundException {
        OrderResponse response = orderService.findOrderById(id);
        return ServiceResponse.ok(response);
    }
}
