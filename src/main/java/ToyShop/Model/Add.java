package ToyShop.Model;

import ToyShop.Data.Toy;
import ToyShop.Data.ToysDistributor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add extends Mode {

    public Add() {
        super("add", "добавить");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        toys.addToy(getToy(toys, scanner, 1));
        System.out.println("-> добавлено");
    }
}
