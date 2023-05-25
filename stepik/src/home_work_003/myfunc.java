package home_work_003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class myfunc {
    public static List<Integer> createList(int size) {
        List<Integer> list = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100));
        }
        return list;
    }

    public static int findMin(List<Integer> list) {
        //return Collections.min(list);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    public static int fintMax(List<Integer> list) {
        return Collections.max(list);
    }

    public static double findAvg(List<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return  sum / (double)list.size();
    }
}
