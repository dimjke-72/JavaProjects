package JavaExceptions.Lesson2.HomeWork;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите строку ->");
        String input = in.nextLine();
        if (input.equals("")) throw new RuntimeException("пустые строки вводить нельзя");
    }
}
