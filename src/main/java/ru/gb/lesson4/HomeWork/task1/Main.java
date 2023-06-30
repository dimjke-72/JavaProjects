package ru.gb.lesson4.HomeWork.task1;

import java.util.Scanner;

public class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        addNodeLast(iScanner);
        showNodeList(head);
        showNodeList(revertNodeList());
    }
    /**
     * @param iScanner ввод с клавиатуры
     * @apiNote добавление значения в конец и создание связей в списке
     */
    private static void addNodeLast(Scanner iScanner) {
        int size = iScanner.nextInt();
        for (int i = 0; i < size; i++) {
            Node node = new Node();
            node.setValue(iScanner.nextInt());
            if (head == null) {
                head = node;
            } else {
                Node current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(node);
            }
        }
        iScanner.close();
    }

    /**
     * @param node узел
     * @apiNote Вывести однонапрвленный список в косноль
     */
    public static void showNodeList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.printf("->%d", current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * @return head
     * @apiNote Вывести список на экран в перевернутом виде
     */
    public static Node revertNodeList() {
        Node pred = null;
        Node current = head;
        while (current != null) {
            Node temp = current.getNext();
            current.setNext(pred);
            pred = current;
            current = temp;
        }
        return pred;
    }
}
