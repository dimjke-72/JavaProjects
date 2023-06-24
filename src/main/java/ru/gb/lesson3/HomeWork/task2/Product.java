package ru.gb.lesson3.HomeWork.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String nameProduct;
    private String country;
    private Integer weightGrams;
    private Integer price;
    private Integer grade;
}