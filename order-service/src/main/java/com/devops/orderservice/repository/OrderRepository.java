package com.devops.orderservice.repository;

import com.devops.orderservice.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String> {

    boolean existsById(String id);

    Optional<Orders> findById(String id);
}
