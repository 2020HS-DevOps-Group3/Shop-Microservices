package com.devops.cloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/order-fallback")
    public Mono<String> orderServiceFallback() {
        return Mono.just("Order Service taking too long to respond. Please try again later");
    }

    @RequestMapping("/product-fallback")
    public Mono<String> productServiceFallback() {
        return Mono.just("Product Service taking too long to respond. Please try again later");
    }

    @RequestMapping("/payment-fallback")
    public Mono<String> paymentServiceFallback() {
        return Mono.just("Payment Service taking too long to respond. Please try again later");
    }
}
