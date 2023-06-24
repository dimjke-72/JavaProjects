package ru.gb.lesson3.HomeWork.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String nameBook;
    private String surnameAuthor;
    private Integer price;
    private Integer year;
    private Integer countPages;
}