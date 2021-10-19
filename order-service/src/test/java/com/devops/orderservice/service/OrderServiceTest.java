package com.devops.orderservice.service;

import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderServiceTest {

    private final OrderRepository repository = Mockito.mock(OrderRepository.class);

    @Test
    @DisplayName("Should save an Order")
    void saveOrder() {
        OrderService orderService = new OrderService(repository);
        Orders order = new Orders("1", "test order", 1, 1000);
        Mockito.when(repository.save(Mockito.any(Orders.class))).thenReturn(order);

        Orders testResponse = orderService.createOrder(order);
        Assertions.assertEquals(order, testResponse);
    }

}