package com.edgars.product.edgarsproduct.controller;

import java.util.List;

import com.edgars.product.edgarsproduct.model.ProductModel;
import com.edgars.product.edgarsproduct.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    public ProductService productService;

    @GetMapping("/product")
    public List<ProductModel>listProduct(){
        return productService.listAllProduct();
    }


}
