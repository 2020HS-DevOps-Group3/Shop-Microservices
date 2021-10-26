package com.devops.productservice.repository;

import com.devops.productservice.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {

    List<Products> findByIdIn(Set<String> ids);
}
