package com.example.springbootcrudexp1.repository;

import com.example.springbootcrudexp1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
