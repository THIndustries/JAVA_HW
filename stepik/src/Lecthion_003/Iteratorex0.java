package Lecthion_003;

import java.util.List;
import java.util.Iterator;

public class Iteratorex0 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,123,1234,12345);

        for (int i: list) {
            System.out.println(i);
        }

        Iterator iter = list.iterator();
        System.out.println();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
