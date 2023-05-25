package Webinar004;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex01 {
    //Замерьте время, за которое в ArrayList добавится 1000_000 элементов.
    //Сделать тоже самое для LinkedList. Сравнить результаты.
    public static void main(String[] args) {
        final int size = 1_000_00;
        System.out.println("Колв-во эллементов: " + size);
        createAL(size);
        createLL(size);
    }

    public static void createAL(int size) {
        long time1 = System.currentTimeMillis();
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            arrlist.add(0, i);
        }
        time1 = System.currentTimeMillis() - time1;
        //System.out.printf("Время: %,9.3f ms\n", time1/1_000_000.0);
        System.out.println("ArrayList: " + time1);
    }

    public static void createLL(int size) {
        long time2 = System.currentTimeMillis(); //возвращает сколько милисекунд прошло с 1970г. на момент запуска.
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i <= size; i++) {
            ll.add(0, i);
        }
        time2 = System.currentTimeMillis() - time2;
        System.out.println("LinkedList: " + time2);
        //System.out.printf("Время: %,9.3f ms\n", time2/1_000_000.0);
    }
}
