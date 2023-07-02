package ru.gb.lesson5.HomeWork;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        String message;
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();
        String[] words = message.toLowerCase().trim().split("\\p{P}?[ \\t\\n\\r]+");
        Map<String, Integer> counter = new HashMap<>();
        for (String i : words) {
            if (!i.isEmpty()) {
                Integer count = counter.get(i);
                if (count == null) {
                    count = 0;
                }
                counter.put(i, ++count);
            }
        }
        for (String j : counter.keySet()) {
            System.out.println(j + ": " + counter.get(j));
        }
    }
}
