package com.devops.productservice.repository;

import com.devops.productservice.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {


    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO Products(id, name, image_url, description, qty, price) VALUES (:id, :name, :imageUrl, :description, :qty, :price)", nativeQuery = true)
    @Transactional
    void insertProduct(String id, String name, String imageUrl, String description, int qty, double price);

    List<Products> findByIdIn(Set<String> ids);
}
