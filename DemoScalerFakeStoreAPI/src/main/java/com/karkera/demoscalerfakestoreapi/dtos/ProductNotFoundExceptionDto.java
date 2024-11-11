package com.karkera.demoscalerfakestoreapi.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundExceptionDto {
    Long errorCode;
    String errorMessage;
}
