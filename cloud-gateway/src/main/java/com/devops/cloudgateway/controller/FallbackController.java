package com.devops.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/order-fallback")
    public Mono<String> orderServiceFallback() {
        return Mono.just("Order Service taking too long to respond. Please try again later");
    }

    @GetMapping("/product-fallback")
    public Mono<String> productServiceFallback() {
        return Mono.just("Product Service taking too long to respond. Please try again later");
    }

    @GetMapping("/payment-fallback")
    public Mono<String> paymentServiceFallback() {
        return Mono.just("Payment Service taking too long to respond. Please try again later");
    }
}
