package ru.gb.lesson5.HomeWork.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<FIO> listEmployees = employees();
        Map<String, Integer> result = nameDuplicateCount(listEmployees);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(result.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        outputTerminal(list);
    }

    /**
     * @param listEmployees входной список
     * @return ключ - имя, значение - количесвто повторений
     * @apiNote выводит повторяющиеся имена с количеством повторений
     */
    private static Map<String, Integer> nameDuplicateCount(List<FIO> listEmployees) {
        Map<String, Integer> result = new HashMap<>();
        for (FIO employee : listEmployees) {
            result.putIfAbsent(employee.getName(), 1);
            result.put(employee.getName(), result.get(employee.getName()) + 1);
        }
        return result;
    }

    /**
     * @param list входной список
     * @apiNote вывод в терминал
     */
    private static void outputTerminal(List<Map.Entry<String, Integer>> list) {
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * @return Список сотрудников
     * @apiNote Создания списка сотрудников
     */
    private static List<FIO> employees() {
        List<FIO> listEmployees = new LinkedList<>();
        FIO fio1 = new FIO("Иван", "Иванов");
        FIO fio2 = new FIO("Кристина", "Белова");
        FIO fio3 = new FIO("Анна", "Мусина");
        FIO fio4 = new FIO("Анна", "Крутова");
        FIO fio5 = new FIO("Иван", "Юрин");
        FIO fio6 = new FIO("Петр", "Лыков");
        FIO fio7 = new FIO("Павел", "Чернов");
        FIO fio8 = new FIO("Петр", "Чернышов");
        FIO fio9 = new FIO("Мария", "Федорова");
        FIO fio10 = new FIO("Марина", "Светлова");
        FIO fio11 = new FIO("Светлана", "Петрова");
        FIO fio12 = new FIO("Мария", "Савина");
        FIO fio13 = new FIO("Мария", "Рыкова");
        FIO fio14 = new FIO("Марина", "Лугова");
        FIO fio15 = new FIO("Анна", "Владимирова");
        FIO fio16 = new FIO("Иван", "Мечников");
        FIO fio17 = new FIO("Петр", "Петин");
        FIO fio18 = new FIO("Иван", "Ежов");
        listEmployees.add(fio1);
        listEmployees.add(fio2);
        listEmployees.add(fio3);
        listEmployees.add(fio4);
        listEmployees.add(fio5);
        listEmployees.add(fio6);
        listEmployees.add(fio7);
        listEmployees.add(fio8);
        listEmployees.add(fio9);
        listEmployees.add(fio10);
        listEmployees.add(fio11);
        listEmployees.add(fio12);
        listEmployees.add(fio13);
        listEmployees.add(fio14);
        listEmployees.add(fio15);
        listEmployees.add(fio16);
        listEmployees.add(fio17);
        listEmployees.add(fio18);
        return listEmployees;
    }
}
