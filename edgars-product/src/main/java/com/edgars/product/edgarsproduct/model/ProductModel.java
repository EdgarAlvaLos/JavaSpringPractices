package com.edgars.product.edgarsproduct.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductModel {

    ProductModel(){

    }

    public ProductModel(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;
    private Float price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public ProductModel name(String name) {
        setName(name);
        return this;
    }

    public ProductModel price(Float price) {
        setPrice(price);
        return this;
    }

}