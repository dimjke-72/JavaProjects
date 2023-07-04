package ru.gb.lesson6.HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new LinkedList<>();
        Notebook notebook1 = new Notebook(17.0, "HP", "черный", 16, 256, "linux", 17000);
        Notebook notebook2 = new Notebook(15.6, "Dell", "серебристый", 8, 128, "DOS", 25000);
        Notebook notebook3 = new Notebook(14.0, "Acer", "белый", 2, 512, "windows", 23000);
        Notebook notebook4 = new Notebook(12.0, "Dell", "серый", 4, 64, "linux", 20000);
        Notebook notebook5 = new Notebook(16.1, "ASUS", "белый", 4, 128, "windows", 17000);
        Notebook notebook6 = new Notebook(15.3, "Lenovo", "черный", 32, 512, "windows", 47000);
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        System.out.println(notebooks);
        System.out.println("\nВведите цифру, соответствующую необходимому критерию фильтра: \n" +
                "1. Диагональ экрана\n" +
                "2. Производитель\n" +
                "3. Цвет\n" +
                "4. Объем ОЗУ\n" +
                "5. Объем ЖД\n" +
                "6. Операционная система\n" +
                "7. Цена\n" +
                "0. Вывести соответствующие выбранным критериям варианты");
        Map<String, String> criterion = criterionDict();
        notebooks = filterNotebook(notebooks, criterion);
        System.out.println(notebooks);
    }

    /**
     * @return параметры фильтра
     * @apiNote собирает критерии в map
     */
    private static Map<String, String> criterionDict() {
        Scanner in = new Scanner(System.in);
        Map<String, String> criterion = new HashMap<>();
        int num = in.nextInt();
        while (num != 0) {
            switch (num)
            {
                case 1 -> {
                    System.out.println("Введите минимальную диагональ экрана: ");
                    String temp = in.next().trim();
                    criterion.put("Screen", temp);
                }
                case 2 -> {
                    System.out.println("Введите производителя: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("Manufacturer", temp);
                }
                case 3 -> {
                    System.out.println("Введите цвет: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("Color", temp);
                }
                case 4 -> {
                    System.out.println("Введите минимальный объем ОЗУ: ");
                    String temp = in.next().trim();
                    criterion.put("RAM", temp);
                }
                case 5 -> {
                    System.out.println("Введите минимальный объем ЖД: ");
                    String temp = in.next().trim();
                    criterion.put("SSD", temp);
                }
                case 6 -> {
                    System.out.println("Введите операционную систему: ");
                    String temp = in.next().trim().toLowerCase();
                    criterion.put("OS", temp);
                }
                case 7 -> {
                    System.out.println("Введите минимальную цену: ");
                    String temp = in.next().trim();
                    criterion.put("Price", temp);
                }
                default -> {
                    System.out.println("Введено некорректное значение");
                }
            }
            System.out.println("Следующий критерий: ");
            num = in.nextInt();
        }
        return criterion;
    }

    /**
     * @param notebooks список нотубуков
     * @param criterion параметры фильтра
     * @return отфильтрованный список ноутбуков
     */
    private static List<Notebook> filterNotebook(List<Notebook> notebooks, Map<String, String> criterion) {
        for (Map.Entry<String, String> entry : criterion.entrySet()) {
            if (entry.getKey().equals("Screen")) notebooks = Filters.filterScreen(notebooks, entry.getValue());
            if (entry.getKey().equals("Manufacturer")) notebooks = Filters.filterManufacturer(notebooks, entry.getValue());
            if (entry.getKey().equals("Color")) notebooks = Filters.filterColor(notebooks, entry.getValue());
            if (entry.getKey().equals("RAM")) notebooks = Filters.filterRAM(notebooks, entry.getValue());
            if (entry.getKey().equals("SSD")) notebooks = Filters.filterSSD(notebooks, entry.getValue());
            if (entry.getKey().equals("OS")) notebooks = Filters.filterOS(notebooks, entry.getValue());
            if (entry.getKey().equals("Price")) notebooks = Filters.filterPrice(notebooks, entry.getValue());
        }
        return notebooks;
    }
}
