package com.devops.orderservice.service;

import com.devops.common.dtos.request.OrderRequest;
import com.devops.common.dtos.response.OrderResponse;
import com.devops.common.dtos.response.ProductResponse;
import com.devops.common.exceptions.OrderNotFoundException;
import com.devops.common.exceptions.ProductNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.common.utils.ServiceUtils;
import com.devops.orderservice.entity.OrderedProducts;
import com.devops.orderservice.entity.Orders;
import com.devops.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final OrderedProductsService orderedProductsService;

    public Orders createOrder(Orders order) {
        return repository.save(order);
    }

    public OrderResponse createOrder(OrderRequest request) {

        Orders order = ServiceUtils.standardModelMapper(request, Orders.class);
        List<OrderedProducts> orderedProducts = ServiceUtils.standardModelsMappers(request.getProducts(), OrderedProducts.class);

        // Save the Order first
        Orders save = repository.save(order);

        // TODO: Verify all the Product Ids by making a call to Product Service
        // Save the Products that are part of the order
        orderedProducts.forEach(p -> p.setOrder(save));
        orderedProductsService.saveAll(orderedProducts);

        // Prepare the response
        List<OrderedProducts> savedOrderedProducts = orderedProductsService.findAllByOrderId(save.getId());
        List<ProductResponse> productResponses = ServiceUtils.standardModelsMappers(savedOrderedProducts, ProductResponse.class);

        OrderResponse response = ServiceUtils.standardModelMapper(save, OrderResponse.class);
        response.setProducts(productResponses);
        return response;
    }

    public OrderResponse findOrderById(String id) throws OrderNotFoundException, ProductNotFoundException {

        Orders order = repository.findById(id).orElseThrow(() -> new OrderNotFoundException(Constants.ErrorMessages.ORDER_NOT_FOUND));

        List<OrderedProducts> orderedProducts = orderedProductsService.findAllByOrderId(id);

        if (orderedProducts.isEmpty())
            throw new ProductNotFoundException(Constants.ErrorMessages.PRODUCT_NOT_FOUND);

        // Prepare the response
        List<ProductResponse> productResponses = ServiceUtils.standardModelsMappers(orderedProducts, ProductResponse.class);
        OrderResponse response = ServiceUtils.standardModelMapper(order, OrderResponse.class);
        response.setProducts(productResponses);

        return response;
    }

    public List<OrderResponse> getAllOrders() {
        List<Orders> orders = repository.findAll();
        List<OrderedProducts> products = orderedProductsService.findAllByOrderIdIn(orders.stream().map(Orders::getId).collect(Collectors.toList()));

        List<OrderResponse> responses = new ArrayList<>();

        orders.forEach(o -> {
            List<OrderedProducts> orderedProducts = products.stream().filter(p ->
                    p.getOrder().getId().equalsIgnoreCase(o.getId())).collect(Collectors.toList());

            OrderResponse response = ServiceUtils.standardModelMapper(o, OrderResponse.class);
            List<ProductResponse> productResponse = ServiceUtils.standardModelsMappers(orderedProducts, ProductResponse.class);

            response.setProducts(productResponse);
            responses.add(response);
        });

        return responses;
    }
}
