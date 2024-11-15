package com.karkera.demoscalerfakestoreapi.repositories;

import com.karkera.demoscalerfakestoreapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
