package Webinar_006;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        ex();
    }
    static void ex() {
        /*
1. Создайте HashSet, заполните его следующими числами: {1,2,3,2,4,5,6,3} Распечатайте содержимое множества.
2. Создайте LinkedHashList, заполните его следующими числами: {1,2,3,2,4,5,6,3} Распечатайте содержимое множества.
3. Создайте TreeSet, заполните его следующими числами: {1,2,3,2,4,5,6,3} Распечатайте содержимое множества.
         */
        Integer[] arr = new Integer[]{3,1,2,2,6,5,4,3};//хэш цифр совпадает с их значением
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr)); //записываем в сет1 наш массив инт.
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
