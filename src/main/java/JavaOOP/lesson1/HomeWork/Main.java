package JavaOOP.lesson1.HomeWork;

import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Найдётся всё");
        Product pr1 = new Product("Телевизов", 25000, 7.0);
        Product pr2 = new Product("Смартфон", 18000, 4.9);
        Product pr3 = new Product("Футболка", 800, 9.7);
        Product pr4 = new Product("Джинсы", 4500, 9.3);
        Product pr5 = new Product("Макароны", 80, 8.5);
        Product pr6 = new Product("Крупа", 150, 6.1);
        shop.addProduct(pr1);
        shop.addProduct(pr2);
        shop.addProduct(pr3);
        shop.addProduct(pr4);
        shop.addProduct(pr5);
        shop.addProduct(pr6);
        Categories cat1 = new Categories("Электроника");
        cat1.addProduct(pr1);
        cat1.addProduct(pr2);
        Categories cat2 = new Categories("Одежда");
        cat2.addProduct(pr3);
        cat2.addProduct(pr4);
        Categories cat3 = new Categories("Продукты");
        cat3.addProduct(pr5);
        cat3.addProduct(pr6);
        User user1 = new User("User1", "123");
        User user2 = new User("User2", "456");
        User user3 = new User("User3", "789");
        List<Product> products = shop.getCatalog();
        System.out.println(products);
        user1.buy(pr1, shop);
        List<Product> user1Buy = user1.getBasket();
        System.out.println(user1.getLogin() + " купил " + user1Buy);
        user2.buy(pr4, shop);
        List<Product> user2Buy = user2.getBasket();
        System.out.println(user2.getLogin() + " купил " + user2Buy);
        user3.buy(pr5, shop);
        List<Product> user3Buy = user3.getBasket();
        System.out.println(user3.getLogin() + " купил " + user3Buy);
        products = shop.getCatalog();
        System.out.println(products);
    }
}
