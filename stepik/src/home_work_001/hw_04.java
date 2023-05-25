package home_work_001;

import java.util.Scanner;

public class hw_04 {
    public static void main(String[] args) {
        /*
        Задано уравнение вида q + w = e, q, w, e >= 0.
        Некоторые цифры могут быть заменены знаком вопроса, например 2? +?5 = 69.
        Требуется востановить выражение до верного равенства.
        Предложить хотя бы одно решение или сообщить, что его нет.
        */
//        Scanner sc = new Scanner(System.in);
//        String num1 = sc.next();
//        String num2 = sc.next();
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    String expression = "2?" + q + "+" + "?5=" + e + "" + w;
                    if (expression.contains("?")) {
                        continue; // Пропускаем комбинацию, если она содержит знак вопроса
                    }
                    int left = Integer.parseInt("2" + q) + Integer.parseInt("" + w + "5");
                    int right = e;
                    if (left == right) {
                        System.out.println(expression); // Выводим верное равенство на экран
                    }
                }
            }
        }

    }
}
