package com.onlineshop.services;

import com.onlineshop.models.Product;

import java.util.List;
import java.util.Optional;
//    DTO => Data Transfer Protocol

public interface ProductService {
    List<Product> readAllProducts();

    Optional<Product> readProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProductById(Long id);
}
