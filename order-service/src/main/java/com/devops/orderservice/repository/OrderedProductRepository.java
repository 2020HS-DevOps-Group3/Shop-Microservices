package com.devops.orderservice.repository;

import com.devops.orderservice.entity.OrderedProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderedProductRepository extends JpaRepository<OrderedProducts, String> {

    @Query("from OrderedProducts p where p.id in ?1")
    List<OrderedProducts> findByIds(List<String> ids);

    //    @Query("from OrderedProducts p where p.id in ?1")
    List<OrderedProducts> findAllByOrderIdIn(List<String> ids);

    List<OrderedProducts> findAllByOrderId(String id);
}
