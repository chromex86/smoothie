package com.chrometech.smoothie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chrometech.smoothie.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
