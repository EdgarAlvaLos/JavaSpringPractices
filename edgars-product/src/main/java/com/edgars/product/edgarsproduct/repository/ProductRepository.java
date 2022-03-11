package com.edgars.product.edgarsproduct.repository;

import com.edgars.product.edgarsproduct.model.ProductModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <ProductModel,Integer> {
    
}