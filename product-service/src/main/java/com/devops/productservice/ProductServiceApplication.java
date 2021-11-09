package com.devops.productservice;

import com.devops.productservice.entity.Products;
import com.devops.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(ProductRepository repository) {
        return arg -> {
            // save a couple of customers
            repository.save(new Products(null, "The Black Google Tee\t", "The Black Google Tee\t", 20, 599));
            repository.save(new Products(null, "Google Tee Green\t", "100% cotton Google t-shirt\t", 15, 899));
            repository.save(new Products(null, "Google Twill Cap\n", "Classic Google cap\n", 99, 299));
        };
    }
}
