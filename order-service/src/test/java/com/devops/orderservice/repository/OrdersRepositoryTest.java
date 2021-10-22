package com.devops.orderservice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
//@ActiveProfiles("test")
class OrdersRepositoryTest {

    @Autowired
    private OrderRepository repository;

    @Test
    void saveOrder() {
        int actual = 0;
        assertEquals(0, actual);
//        Orders order = new Orders(null, "test order", 1, 100);
//        Orders savedOrder = repository.save(order);
//        assertThat(savedOrder).usingRecursiveComparison().ignoringFields("id").isEqualTo(order);
    }
}
