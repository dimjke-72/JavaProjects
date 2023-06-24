package ru.gb.lesson1.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseWords(str));
        scanner.close();
    }
    /**
     * @apiNote Дана строка. Развернуть слова.
     * @param s заданная строка
     * @return результат
     */
    public static String reverseWords(String s) {

        StringBuilder str=new StringBuilder(s);
        //reverse the string and trim the side spaces!
        s=str.reverse().toString().trim()+" ";
        String word="",ans=""; int fg=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                fg=0;
                word=s.charAt(i)+word;
            }
            else if(fg==0)
            {
                ans+=" "+word;
                fg=1;
                word="";
            }
        }
        return ans.trim();
    }
}
