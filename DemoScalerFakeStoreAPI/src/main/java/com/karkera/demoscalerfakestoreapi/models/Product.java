package com.karkera.demoscalerfakestoreapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "product")
public class Product extends BaseModel {
    String description;
    Double price;
    @ManyToOne
    Category category;
    String image;
}
