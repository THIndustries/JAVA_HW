package Webinar002;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //строка - не изменяемый тип данных.
        //StringBuilder - грубо говоря, это массив символов, который можно собрать в String
        //через join
        //
        //Задача: дано четное число n и символы с1 и с2. Написать метод,
        // который вернет строку длинны n, который состоит из чередующихся символов с1 и с2.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        StringBuilder res = funcName(n, c1, c2);

        System.out.println(String.join(" ", res));
    }

    public static StringBuilder funcName(int arg, char arg2, char arg3){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arg/2; i++) {
            sb.append(arg2).append(arg3).append(" ");
        }
        return sb;
    }
}
