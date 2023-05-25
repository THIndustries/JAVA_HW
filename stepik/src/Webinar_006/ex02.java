package Webinar_006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ex02 {
    public static void main(String[] args) {
        ex();
    }

    static void ex() {
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и c помошью Set вычислите процент уникальных
        значений в данном массиве.
        Для вычисления формула:
        процент уник. чисел = кол-во уник.чисел * 100 / общее кол-во чисел в массиве.
         */
        Integer[] arr = createArr(0,24,10); //создаем наш сет через метод.
        System.out.println(Arrays.toString(arr));
        double percent = findUnic(arr);
        System.out.println(percent);
    }
    static double findUnic(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));//Конвертируем arr[] в Set<Integer> set.
        double percent = (double) (set.size() * 100 / arr.length);//приводим к дабл, чтобы не потерять дробную часть.
        return percent;
    }
    static Integer[] createArr(int min, int max, int capacity) { //Метод который создает и возвращает массив инт.
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            int num = (int)(Math.random() * (max-min + 1) + min);
            arr[i] = num;
        }
        return arr;
    }
}
