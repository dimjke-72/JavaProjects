package ru.gb.lesson3.HomeWork.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Гречка высшего сорта", "Россия", 200, 2000, 2);
        Product product2 = new Product("Колесо", "Турция", 200, 1000, 2);
        Product product3 = new Product("Булка", "Китай", 12000, 5000, 3);
        Product product4 = new Product("Хлеб", "Китай", 70, 12569, 1);
        Product product5 = new Product("Макароны высшей категории", "Италия", 85, 50, 2);
        Product product6 = new Product("Планшет", "Франция", 700, 8520, 2);
        Product product7 = new Product("Смартфон", "США", 200, 1500, 1);
        Product product8 = new Product("Велосипед", "Россия", 130, 1000, 3);
        Product product9 = new Product("Стиральная машина", "Китай", 40000, 50000, 3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        List<String> result = productGetGradeMinPrice(products);
        for (String s : result) {
            System.out.print(s + "; ");
        }
    }

    /**
     * @param products список товаров
     * @return список имен товаров
     * @apiNote получить наименования товаров заданного сорта с наименьшей ценой
     */
    private static List<String> productGetGradeMinPrice(List<Product> products) {
        int grade = getGrade();
        List<String> result = new ArrayList<>();
        int min = findMaxPrice(products);
        for (Product product : products) {
            if (product.getGrade() == grade && min > product.getPrice()) min = product.getPrice();
        }
        for (Product product : products) {
            if (product.getPrice() == min) result.add(product.getNameProduct());
        }
        return result;
    }

    /**
     * @param products список товаров
     * @return максимальная цена
     * @apiNote нахождение максимальной цены среди товаров
     */
    private static int findMaxPrice(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if (max < product.getPrice()) max = product.getPrice();
        }
        return max;
    }

    /**
     * @return заданный пользователем сорт товара
     * @apiNote пока не будет правильное значение
     */
    private static int getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара(1, 2, 3):");
        while (true) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default: {
                    System.out.println("Введен некорректный сорт");
                    break;
                }
            }
        }
    }
}
