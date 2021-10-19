package com.devops.orderservice.controller;

import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.service.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = OrderController.class)
class OrderControllerTest {

    @MockBean
    private OrderService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Test Create Order Endpoint")
    void testCreateOrder() throws Exception {

        Orders order = new Orders("1", "test order", 1, 1);
        Mockito.when(service.createOrder(Mockito.any(Orders.class))).thenReturn(order);

        mockMvc.perform(MockMvcRequestBuilders.post("/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"name\":\"Mobile\",\n" +
                                "    \"qty\":\"2\",\n" +
                                "    \"price\":1000\n" +
                                "}"))
                .andExpect(MockMvcResultMatchers.status().is(201))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }
}
