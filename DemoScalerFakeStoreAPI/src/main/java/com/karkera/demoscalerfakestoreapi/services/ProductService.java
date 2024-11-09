package com.karkera.demoscalerfakestoreapi.services;

import com.karkera.demoscalerfakestoreapi.models.Product;


public interface ProductService {
    public Product getProductById(Long id);
}
