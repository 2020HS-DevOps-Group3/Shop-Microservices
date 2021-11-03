package com.devops.orderservice.repository;

import com.devops.orderservice.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@ActiveProfiles("test")
class OrdersRepositoryTest {

    @Autowired
    private OrderRepository repository;

    @Test
    void saveOrder() {
        Orders order = new Orders(null, 1, 100);
        Orders savedOrder = repository.save(order);
        assertThat(savedOrder).usingRecursiveComparison().ignoringFields("id").isEqualTo(order);
    }
}
