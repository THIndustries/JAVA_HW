package Lecthion_005;

import java.util.HashMap;
import java.util.Map;

public class ex01 {
    public static void main(String[] args) {
        //Работа с парами!
        Map<Integer,String> myMap = new HashMap<>();
        myMap.putIfAbsent(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        System.out.println(myMap);

        for (var item: myMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(),item.getValue()); //обращаемся к ключу и значению соот.
        }
    }
}
