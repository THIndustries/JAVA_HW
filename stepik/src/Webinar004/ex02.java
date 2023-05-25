package Webinar004;

import java.util.LinkedList;
import java.util.Scanner;

public class ex02 {
    /*
    Реализовать консольное приложение, которое:
    1.Принимает от пользователя строку вида
    text
    1.Нужно сохранить text  в связной список.
    2. Если введено print~num, выводит строку оиз позиции num в связном списке и удаляет её из списка.
    asd
    [asd]
    qwe
    [asd, qwe]
    zxc
    [asd, qwe, zxc]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        boolean isContinue = true;

        while (isContinue) {
            String text = sc.next();
            if (text.equalsIgnoreCase("stop")) {
                isContinue = false;
            } else if (text.contains("print")) {
                int i = text.indexOf("~");
                int num = Integer.parseInt(text.substring(i + 1));
                System.out.println(ll.get(num-1));
                ll.remove(num-1);
                System.out.println(ll);
            } else {
                ll.add(text);
                System.out.println(ll);
            }
        }
        sc.close();
    }
}
