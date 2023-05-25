package Webinar_004_1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        /*
        Написать программу, которая:
        Принимает от пользователя и "заполняет"строки.
        Если введено print, выводит строки так, чтобы последняя введеная была первой  списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        ex0();
    }
    static void ex0() {
        Scanner sc = new Scanner(System.in);
        boolean isWork = true;
        LinkedList<String> ll = new LinkedList<>();
        while (isWork) {
            System.out.println("Введите команду: ");
            String text = sc.nextLine();
            switch (text){
                case "print":
                    ListIterator<String> iter = ll.listIterator(ll.size());//создаем лист-итератор и указываем
                    //итерацию с конца списка.
                    //обрати внимание, что мы обращаемся как бы за пределами массива, это нормально, потому что
                    //следующая команда has.Previous() проверяет как раз последний эллемент листа.
                    while (iter.hasPrevious()) {//пока есть элемент "позади"
                        System.out.println(iter.previous());//выводить предыдущий элемент
                    }
                    break;
                case "exit":
                    System.out.println("See you later.");
                    isWork = false;
                    break;
                case "revert":
                    ll.removeLast(); //удаляет предыдущую введенную строку из памяти.
                    break;
                default:
                    ll.add(text); // добавляет текс в список
            }

        }
    }
}
