package ru.gb.lesson1.HomeWork;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int previousNumber = 0;
        boolean foundNegative = false;
        System.out.println("Write: ");
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 0) {
                foundNegative = true;
            }
            if (foundNegative) {
                sum += previousNumber;
                foundNegative = false;
            }
            previousNumber = number;
        }
        System.out.println(sum);
    }
}
