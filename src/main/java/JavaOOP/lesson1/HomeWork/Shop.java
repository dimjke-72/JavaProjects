package JavaOOP.lesson1.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private List<Product> catalog;

    public Shop(String name, List<Product> catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public Shop(String name) {
        this.name = name;
        this.catalog = new LinkedList<>();
    }

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public List<Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Product> catalog) {
        this.catalog = catalog;
    }

    public void addProduct(Product product) {
        this.catalog.add(product);
    }

    public void removeProduct(Product product) {
        this.catalog.remove(product);
    }

    @Override
    public String toString() {
        return "Рады видеть вас в магазине *" + name + "*, представлены следующие категории и товары: " + catalog;
    }
}
