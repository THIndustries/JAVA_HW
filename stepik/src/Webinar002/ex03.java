package Webinar002;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        //Напишите метод, который принимает на вход строку(String) и
        //определяет является ли строка палиндромом(возвращает boolean значение).
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(polindrom(word));
    }
    public static boolean polindrom(String arg) {
        StringBuilder sb = new StringBuilder();
        for (int i = arg.length() - 1; i >= 0; i--)
            sb.append(arg.charAt(i));
        String revStr = sb.toString();
        return arg.equals(revStr);
    }
}
