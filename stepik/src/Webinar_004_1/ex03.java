package Webinar_004_1;

import java.util.LinkedList;
import java.util.Scanner;

public class ex03 {
    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида text~num
    Нужно рассплитить строку по ~, сохранить text в связный список по позицию num.
    Если введено print~num, выводить строку из позиции num в связном списке и удаляет её из списка.
     */
    public static void main(String[] args) {
        ex0();
    }
    static void ex0() {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        boolean isWork = true;
        while (isWork) {
            System.out.println("Введите команду: ");
            String command = sc.nextLine();
            String[] splitLine = command.split("~");
                switch (splitLine[0]) {
                    case "printall":
                        System.out.println(ll);
                        break;
                    case "print":
                        System.out.println(ll.remove(Integer.parseInt(splitLine[1])));
                        break;
                    case "exit":
                        System.out.println("До скорого.");
                        isWork = false;
                        break;
                    default:
                        if(Integer.parseInt(splitLine[1]) <= ll.size())
                            ll.add(Integer.parseInt(splitLine[1]), splitLine[0]);
                        else System.out.println("Не надо так.");
                    }

            }
        }
    }


