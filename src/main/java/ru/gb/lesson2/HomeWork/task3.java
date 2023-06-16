package ru.gb.lesson2.HomeWork;

import java.util.Scanner;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        int sum = sumIndex(array);
        changeArray(array, sum);
    }
    /**
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param array заданный массив
     * @return сумма индексов двухзначных элементов
     */
    private static int sumIndex(int[] array) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1000) - 500;
            if ((-100 < array[i] && array[i] < -9) || (9 < array[i] && array[i] < 100)) sum += i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return sum;
    }
    /**
     * @param array заданный массив
     * @param sum сумма индексов двухзначных элементов
     */
    private static void changeArray(int[] array, int sum) {
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0) array[j] = sum;
            System.out.print(array[j] + " ");
        }
    }
}
