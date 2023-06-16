package ru.gb.lesson2.HomeWork;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        int sum = 0;
        for (int item : array) {
            if (isSimple(item)) sum += item;
            System.out.print(item + " ");
        }
        System.out.println("\nСумма простых чисел последовательности = " + sum);
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел
     * @param number число для проверки
     * @return результат
     */
    public static boolean isSimple (int number) {
        if (number < 2) return false;
        for (int i = 2; i < Math.pow(number, 0.5) + 1 ; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
