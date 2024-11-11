package com.karkera.demoscalerfakestoreapi.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_student")
@DiscriminatorValue("1")
public class Student extends User {
    String course;
    String batch;
}
