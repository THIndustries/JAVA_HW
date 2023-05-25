package home_work_001;

import java.util.Scanner;

public class hw_01 {
    public static void main(String[] args) {
        //1.Вычислить [n-ое треугольное число] (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Треугольное число от %d = ", n);
        double res = n*(n+1)/2;
        System.out.println((int)res);

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("Факториал чила %d равен %d", n, fact);
    }
}
