package Webinar002;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //Напишите метод, который сжимает строку. Пример: aaaabbbcddd = a4b3cd3.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder res = funcArh(line);
        System.out.print(res.toString());
    }

    public static StringBuilder funcArh(String line) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < line.length()-1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                count++;
            } else {
                if(count > 1) {
                    sb.append(line.charAt(i)).append(count);
                } else {
                    sb.append(line.charAt(i));
                }
                count = 1;
            }
        }
        if(count > 1) {
            sb.append(line.charAt(line.length()-1)).append(count);
        } else {
            sb.append(line.charAt(line.length()-1));
        }
        return sb;
    }
}

