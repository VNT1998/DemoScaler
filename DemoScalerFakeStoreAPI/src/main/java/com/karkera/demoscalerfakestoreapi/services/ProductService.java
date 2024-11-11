package com.karkera.demoscalerfakestoreapi.services;

import com.karkera.demoscalerfakestoreapi.exceptions.ProductNotFoundException;
import com.karkera.demoscalerfakestoreapi.models.Product;

import javax.management.InstanceNotFoundException;


public interface ProductService {
    public Product getProductById(Long id) throws ProductNotFoundException;

    public Iterable<Product> getAllProducts();

    public Product updateProduct(Long id, Product product);
}
