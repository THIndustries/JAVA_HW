package Webinar_003_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1() {
        /*
        Заполнить список десятью случайныи числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        List<Integer> mylist = createList(10,4,10);
        System.out.println(mylist);
        sort(mylist);//Обрати внимание, метод void, но лист отсортирован, потому что ссылочный тип данных.
        System.out.println(mylist);
    }

    static void sort(List<Integer> list) {
        Collections.sort(list);
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        //Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max - min + 1) + min));
        }
        return result;
    }
}
