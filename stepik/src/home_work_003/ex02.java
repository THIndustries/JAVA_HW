package home_work_003;

import java.util.*;
import static home_work_003.myfunc.*;

public class ex02 {
    //Задан целочисленный список ArrayList.
    //Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во эллементов: ");
        int size = sc.nextInt();
        List<Integer> myList = createList(size);
        System.out.println(myList);
        System.out.println("Минимальное значение: " + findMin(myList));
        System.out.println("Максимально значение: " + fintMax(myList));
        System.out.println("Среднее арифмитическое: " + findAvg(myList));
    }


}
