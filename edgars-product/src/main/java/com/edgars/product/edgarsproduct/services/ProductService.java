package com.edgars.product.edgarsproduct.services;

import java.util.List;
import java.util.Optional;

import com.edgars.product.edgarsproduct.model.ProductModel;
import com.edgars.product.edgarsproduct.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel>listAllProduct(){
        return productRepository.findAll();
    }

    public void saveProduct(ProductModel product){
        productRepository.save(product);
    }

    public Optional<ProductModel> getById(Integer id){
       return productRepository.findById(id); 
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}