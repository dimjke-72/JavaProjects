package ToyShop.Model;

import ToyShop.Data.Toy;
import ToyShop.Data.ToysDistributor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edit extends Mode {

    public Edit() {
        super("edit", "редактирование");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        int id;
        try {
            System.out.println("Введите id ->");
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException();
        }
        Toy editToy = toys.searchById(id);
        System.out.println(editToy);
        System.out.print("редактировать Y/N ->");
        String choice = scanner.next().toLowerCase().trim().strip();
        if (choice.equals("y")) {
            editToy.setToy(getToy(toys, scanner, 0));
            System.out.println("-> изменено");
        } else System.out.println("выход в меню");
    }
}
