package home_work_001;

import java.util.Scanner;

public class hw_03 {
    public static void main(String[] args) {
        //Реализовать простой калькулятор
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввете первый операнд: ");
        double num1 = sc.nextDouble();
        System.out.print("\nВведите операцию (+ - * /): ");
        char oper = sc.next().charAt(0);
        System.out.print("\nВведите второй операнд: ");
        double num2 = sc.nextDouble();

        switch (oper){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Вы ввели неправильную опервыцию");
                break;
        }
    }
}
