package com.devops.orderservice.controller;

import com.devops.common.dtos.request.OrderRequest;
import com.devops.common.dtos.response.OrderResponse;
import com.devops.common.dtos.response.ProductResponse;
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

import java.util.Arrays;
import java.util.UUID;

@WebMvcTest(controllers = OrderController.class)
class OrderControllerTest {

    @MockBean
    private OrderService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Test Create Order Endpoint")
    void testCreateOrder() throws Exception {
        ProductResponse product1 = new ProductResponse("55a46d25-82d1-4c3e-a559-c7564fa59e32", 1, 990);
        ProductResponse product2 = new ProductResponse("e35c05c3-5107-4f80-a8a7-35b34e37554b", 3, 499);
        OrderResponse response = new OrderResponse(UUID.randomUUID().toString(), 4, 1489, Arrays.asList(product1, product2));

        Mockito.when(service.createOrder(Mockito.any(OrderRequest.class))).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.post("/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"totalQty\":4,\n" +
                                "    \"totalPrice\":1489,\n" +
                                "    \"products\": [\n" +
                                "        {\n" +
                                "            \"id\": \"55a46d25-82d1-4c3e-a559-c7564fa59e32\",\n" +
                                "            \"qty\": 1,\n" +
                                "            \"price\": 990\n" +
                                "        },\n" +
                                "        {\n" +
                                "            \"id\": \"e35c05c3-5107-4f80-a8a7-35b34e37554b\",\n" +
                                "            \"qty\": 3,\n" +
                                "            \"price\": 499\n" +
                                "        }\n" +
                                "    ]\n" +
                                "}"))
                .andExpect(MockMvcResultMatchers.status().is(201))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Get Order by Id")
    void testGetAOrder() throws Exception {

        ProductResponse product1 = new ProductResponse("55a46d25-82d1-4c3e-a559-c7564fa59e32", 1, 990);
        ProductResponse product2 = new ProductResponse("e35c05c3-5107-4f80-a8a7-35b34e37554b", 3, 499);
        OrderResponse response = new OrderResponse(UUID.randomUUID().toString(), 4, 1489, Arrays.asList(product1, product2));

        Mockito.when(service.findOrderById(Mockito.any(String.class))).thenReturn(response);

        mockMvc.perform(MockMvcRequestBuilders.get("/orders/" + UUID.randomUUID()))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }
}
