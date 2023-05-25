package Webinar004;

import java.util.*;

public class ex03 {
    /*
    Реализовать консольное приложение, которое:
    1.Принимает от пользователя и "запоминает" строки.
    2. Если введиено print, выводит строки так, чтобы последняя введеная была первой в списке, а первая - последней.
    Dueue либо Stack
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        Deque<String> dq = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            text = sc.next();
            if (text.equalsIgnoreCase("print")) {
                Iterator<String> iter = dq.descendingIterator();
                while(iter.hasNext()) {
                    System.out.println(iter.next() + " ");
                    flag = false;
                }
                System.out.println();
            }
            else dq.add(text);
        }

    }
}
