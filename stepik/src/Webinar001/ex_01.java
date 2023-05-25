package Webinar001;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) throws Exception {

        //Написать программу, которая запросит у пользователя имя и выведет "Привет, name!"
        //System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println();
        System.out.printf("Привет, %s", name);
        sc.close();

    }
    //метод очистки консоли терминала

}
