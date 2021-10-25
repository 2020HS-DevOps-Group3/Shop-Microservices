package com.devops.paymentservice.repository;

import com.devops.paymentservice.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payments, String> {

    boolean existsByOrderId(String orderId);

    Optional<Payments> findByOrderId(String orderId);
}
