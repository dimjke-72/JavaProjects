package ru.gb.lesson3.HomeWork;

import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = iScanner.nextInt();
        iScanner.close();
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(30 + 30) - 40);
        }
        System.out.println(array);
        System.out.println("максимум = " + Collections.max(array));
        System.out.println("минимум = " + Collections.min(array));
        System.out.println("среднее = " + array.stream().mapToInt(a -> a).average().orElse(0));
    }
}
