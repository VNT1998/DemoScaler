package com.karkera.demoscalerfakestoreapi.controllers;

import com.karkera.demoscalerfakestoreapi.dtos.ProductNotFoundExceptionDto;
import com.karkera.demoscalerfakestoreapi.exceptions.ProductNotFoundException;
import com.karkera.demoscalerfakestoreapi.models.Product;
import com.karkera.demoscalerfakestoreapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
         Product product = null;
        product = productService.getProductById(id);
        ResponseEntity<Product> responseEntity;
        responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
         return responseEntity;
    }

    @GetMapping("/")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }
}
