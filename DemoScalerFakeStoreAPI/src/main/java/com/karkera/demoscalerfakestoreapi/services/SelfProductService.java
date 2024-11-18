package com.karkera.demoscalerfakestoreapi.services;

import com.karkera.demoscalerfakestoreapi.exceptions.ProductNotFoundException;
import com.karkera.demoscalerfakestoreapi.models.Category;
import com.karkera.demoscalerfakestoreapi.models.Product;
import com.karkera.demoscalerfakestoreapi.projections.ProductTitleAndDescription;
import com.karkera.demoscalerfakestoreapi.repositories.CategoryRepository;
import com.karkera.demoscalerfakestoreapi.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService {
    ProductRepository productRepo;
    private final CategoryRepository categoryRepo; // Ideally category service

    public SelfProductService(ProductRepository productRepo,
                              CategoryRepository categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }
    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        ProductTitleAndDescription productTitleAndDescription = productRepo.getProductTitleAndDescSQL(id);
        System.out.println("Pojection" + productTitleAndDescription.getTitle() + " " +productTitleAndDescription.getDescription());
        return productRepo.findById(id).get();
        //return productRepo.getProductTitleAndDesc(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
}
