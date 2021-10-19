package com.devops.paymentservice.repository;

import com.devops.paymentservice.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payments, String> {

    boolean existsByOrderId(String orderId);
}
