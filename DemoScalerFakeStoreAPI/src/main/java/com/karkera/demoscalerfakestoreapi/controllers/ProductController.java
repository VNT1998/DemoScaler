package com.karkera.demoscalerfakestoreapi.controllers;

import com.karkera.demoscalerfakestoreapi.dtos.ProductNotFoundExceptionDto;
import com.karkera.demoscalerfakestoreapi.exceptions.ProductNotFoundException;
import com.karkera.demoscalerfakestoreapi.models.Product;
import com.karkera.demoscalerfakestoreapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    ProductService productService;

    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
         Product product = null;
        product = productService.getProductById(id);
        ResponseEntity<Product> responseEntity;
        responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
         return responseEntity;
    }

    @GetMapping
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.replaceProduct(id,product);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
