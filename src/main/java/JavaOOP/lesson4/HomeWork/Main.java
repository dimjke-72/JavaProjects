package JavaOOP.lesson4.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.11, 2.22, 3.33, 4.44, 5.55, 6.66, 7.77, 8.88, 9.99));
        List<String> listString = new ArrayList<>(Arrays.asList("1.9", "2.5", "3.7", "4.47", "5"));

        System.out.println("Сумма = " + calculator.sum(listInt));
        System.out.println("Деление = " + calculator.div(listInt));
        System.out.println("Умножение = " + calculator.multiply(listInt));

        System.out.println("Сумма = " + calculator.sum(listDouble));
        System.out.println("Деление = " + calculator.div(listDouble));
        System.out.println("Умножение = " + calculator.multiply(listDouble));

        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listInt));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listDouble));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listString));
    }
}
