package com.devops.orderservice.service;

import com.devops.common.dtos.request.OrderRequest;
import com.devops.common.dtos.request.ProductRequest;
import com.devops.common.dtos.response.OrderResponse;
import com.devops.common.dtos.response.ProductResponse;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.common.utils.ServiceUtils;
import com.devops.orderservice.entity.OrderedProducts;
import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Set;

class OrderServiceTest {

    private final OrderRepository repository = Mockito.mock(OrderRepository.class);
    private final OrderedProductsService orderedProductsService = Mockito.mock(OrderedProductsService.class);
    private final RestTemplate restTemplate = Mockito.mock(RestTemplate.class);

    @Test
    @DisplayName("Should save an Order")
    void saveOrder() {
        OrderService orderService = new OrderService(repository, orderedProductsService, restTemplate);

        Orders order = new Orders("1", 1, 1000);
        Mockito.when(repository.save(Mockito.any(Orders.class))).thenReturn(order);

        Orders testResponse = orderService.createOrder(order);
        Assertions.assertEquals(order, testResponse);
    }

    @Test
    @DisplayName("Should save an Order from Actual Response")
    void saveOrderFromResponse() throws ProductNotFoundException {
        OrderService orderService = new OrderService(repository, orderedProductsService, restTemplate);

        Orders order = new Orders("1", 100, 1000);
        Mockito.when(repository.save(Mockito.any(Orders.class))).thenReturn(order);

        Mockito.when(restTemplate.postForObject("http://Product-Service/products/verify/v1", Set.of("1"), Boolean.class)).thenReturn(true);

        OrderedProducts orderedProducts = new OrderedProducts("1", "1", 100, 1000, order);
        Mockito.when(orderedProductsService.findAllByOrderId(Mockito.any(String.class))).thenReturn(List.of(orderedProducts));

        List<ProductResponse> productResponses = ServiceUtils.standardModelsMappers(List.of(orderedProducts), ProductResponse.class);
        OrderResponse response = new OrderResponse("1", 100, 1000, productResponses);

        OrderRequest testRequest = new OrderRequest(List.of(new ProductRequest("1", 100, 1000)), 100, 1000);
        OrderResponse testResponse = orderService.createOrder(testRequest);
        Assertions.assertEquals(response, testResponse);
    }

    @Test
    @DisplayName("Throws Product Not Found Exception")
    void saveOrderFromResponseExpectException() {
        OrderService orderService = new OrderService(repository, orderedProductsService, restTemplate);

        Orders order = new Orders("1", 100, 1000);
        Mockito.when(repository.save(Mockito.any(Orders.class))).thenReturn(order);

        Mockito.when(restTemplate.postForObject("http://Product-Service/products/verify/v1", Set.of("1"), Boolean.class)).thenReturn(false);

        OrderedProducts orderedProducts = new OrderedProducts("1", "1", 100, 1000, order);
        Mockito.when(orderedProductsService.findAllByOrderId(Mockito.any(String.class))).thenReturn(List.of(orderedProducts));

        List<ProductResponse> productResponses = ServiceUtils.standardModelsMappers(List.of(orderedProducts), ProductResponse.class);
        OrderResponse response = new OrderResponse("1", 100, 1000, productResponses);

        OrderRequest testRequest = new OrderRequest(List.of(new ProductRequest("1", 100, 1000)), 100, 1000);

        Exception exception = Assertions.assertThrows(ProductNotFoundException.class,
                () -> orderService.createOrder(testRequest), Constants.ErrorMessages.PRODUCT_NOT_FOUND);

        String expectedMessage = Constants.ErrorMessages.PRODUCT_NOT_FOUND;
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}