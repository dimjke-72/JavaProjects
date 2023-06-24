package ru.gb.lesson3.HomeWork.task1;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
            Product product1 = new Product("Гречка высшего сорта", 10000, 1);
        Product product2 = new Product("Колесо", 1000, 2);
        Product product3 = new Product("Булка", 1520, 2);
        Product product4 = new Product("Хлеб", 200, 1);
        Product product5 = new Product("Макароны высшей категории", 50, 3);
        Product product6 = new Product("Планшет", 500, 1);
        Product product7 = new Product("Смартфон", 750, 1);
        Product product8 = new Product("Велосипед", 520, 2);
        Product product9 = new Product("Стиральная машина", 69000, 3);
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
        System.out.println("Наибольшая цена товаров = " + maxPriceProduct(products));
    }

    /**
     * @param products передоваемый список товаров
     * @return Наибольшая цена товара
     * @apiNote Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший»
     */
    private static int maxPriceProduct(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if ((product.getGrade() == 1 || product.getGrade() == 2)
                    && product.getNameProduct().toLowerCase().contains("высш")) {
                if (max < product.getPrice()) max = product.getPrice();
            }
        }
        return max;
    }
}
