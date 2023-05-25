package Webinar002;

import java.util.Scanner;

public class ex02_1 {
    public static void main(String[] args) {
        //Напишите метод, который сжимает строку. Пример: aaaabbbcddd = a4b3cd3.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.print(zipString(line));
    }
    public static String zipString(String arg) {
        StringBuilder sb = new StringBuilder();
        sb.append(arg.charAt(0));
        int count = 1;
        for (int i = 1; i < arg.length(); i++) {
            if(arg.charAt(i) == arg.charAt(i-1)) count++;
            else {
                if(count != 1) {
                    sb.append(count);
                    count = 1;
                    sb.append(arg.charAt(i));
                }
            }
        }
        if(count != 1) sb.append(count);
        return sb.toString();
    }
}
