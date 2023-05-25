package Webinar003;

import java.util.*;

public class main {
    //ArrayList - списки.
    //В чем отличие List oт ArrayList? List это общая коллекция, а ArrayList, это её реализация.
    //В ArrayList намного больше функционала.

    public static void main(String[] args) {
        ArrayList<String> plannets = new ArrayList<>(
                Arrays.asList("земля", "юпитер", "Сатурн", "земля", "марс", "земля", "юпитер"));
        ArrayList<String> sortPlan = new ArrayList<>();
        for (int i = 0; i < plannets.size() -1; i++) {

        }

    }

    static void ex1() {
        List<Integer> list = new ArrayList<>(10);
        Random random = new Random(100);
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        System.out.println(list);
        //list.sort(Comparator.naturalOrder()); //сортировка по возрастанию
        list.sort(Comparator.reverseOrder()); //сортировка по убыванию
        System.out.println(list);
    }

}
