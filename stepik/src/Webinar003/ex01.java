package Webinar003;

import java.util.ArrayList;
import java.util.Random;

public class ex01 {
    //Заполнить список десятью случайными числами. Отсортировать список методом sort()  и вывести его на экран.
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        final int size = 10;
        Random myrandom = new Random();
        for (int i = 0; i < size; i++) {
            mylist.add(myrandom.nextInt(100));
        }
        mylist.sort(null);
        //Collections.sort(mylist); //использую метод sort() класса Collections
        System.out.println(mylist.toString());
    }
}
