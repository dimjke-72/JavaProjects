package ru.gb.lesson6.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Filters {
    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по диагонали экрана
     */
    public static List<Notebook> filterScreen(List<Notebook> notebooks, String value) {
        double screen = Double.parseDouble(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Screen() >= screen) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по производителю
     */
    public static List<Notebook> filterManufacturer(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Manufacturer().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по цвету
     */
    public static List<Notebook> filterColor(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Color().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по объему RAM
     */
    public static List<Notebook> filterRAM(List<Notebook> notebooks, String value) {
        Integer ram = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.RAM() >= ram) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по объему SSD
     */
    public static List<Notebook> filterSSD(List<Notebook> notebooks, String value) {
        Integer ssd = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.SSD() >= ssd) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по операционной системе
     */
    public static List<Notebook> filterOS(List<Notebook> notebooks, String value) {
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.OS().toLowerCase().equals(value)) result.add(notebook);
        }
        return result;
    }

    /**
     * @param notebooks список нотубуков
     * @param value     параметр
     * @return отфильтрованный список ноутбуков
     * @apiNote метод фильтра по цене
     */
    public static List<Notebook> filterPrice(List<Notebook> notebooks, String value) {
        Integer price = Integer.parseInt(value);
        List<Notebook> result = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if (notebook.Price() >= price) result.add(notebook);
        }
        return result;
    }
}
