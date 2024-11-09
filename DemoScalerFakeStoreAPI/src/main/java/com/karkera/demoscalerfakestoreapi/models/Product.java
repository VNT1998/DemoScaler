package com.karkera.demoscalerfakestoreapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    Long id;
    String title;
    String desc;
    Double price;
    Category category;
    String image;
}
