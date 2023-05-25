package Webinar_004_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex02 {
    /*
    1)Замертите время, за которое в ArrayList добавятся 10_000 элементов
    2)Тоже самое с LinkedList. Cравнить время.
     */
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list1.add(0, i);
        }
        long timeFinidh = System.currentTimeMillis();
        System.out.println(timeFinidh - timeStart);
    }
}
