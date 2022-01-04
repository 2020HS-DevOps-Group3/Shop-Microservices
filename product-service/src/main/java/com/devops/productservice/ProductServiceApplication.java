package com.devops.productservice;

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
            // initialize db with few products
            repository.insertProduct("1800b1c5-d367-46e2-ad6b-03bae437bc54", "The Black Google Tee\t", "https://developers.google.com/shopping-content/images/shirt.jpg", "The Black Google Tee\t", 20, 599);
            repository.insertProduct("6658b549-6e64-4a9d-a130-3313b36425c1", "Google Tee Green\t", "https://developers.google.com/shopping-content/images/shirt2.jpg", "100% cotton Google t-shirt\t", 15, 899);
            repository.insertProduct("f26cbd80-3e8d-456a-b46f-11d5298357fc", "Google Twill Cap\n", "https://developers.google.com/shopping-content/images/cap.jpg", "Classic Google cap\n", 99, 299);
        };
    }
}
