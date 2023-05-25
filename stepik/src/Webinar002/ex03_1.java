package Webinar002;

import java.util.Scanner;

public class ex03_1 {
    public static void main(String[] args) {
        //Напишите метод, который принимает на вход строку(String) и
        //определяет является ли строка палиндромом(возвращает boolean значение).
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(isPolind(word));
    }
    public static boolean isPolind(String line) {
        boolean isPol = true;
        int i1 = 0, i2 = line.length() - 1;
        while (i2 > i1) {
            if(line.charAt(i1) != line.charAt(i2))
                return false;
            else {
                i1++;
                i2--;
            }
        }
        return isPol;
    }
}
