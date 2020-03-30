package com.bhavin.springbootcrud.repository;

import com.bhavin.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//    Product findByName(String name);
}
