package ru.gb.lesson4.HomeWork;

import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"(){}[]\") = " + isValid("(){}[]"));
        System.out.println("isValid(\"(]\") = " + isValid("(]"));
        System.out.println("isValid(\"({})\") = " + isValid("({})"));
    }


    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
