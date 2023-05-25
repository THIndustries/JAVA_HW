package Webinar_004_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Марс");

        System.out.println(Collections.frequency(planets, "Земля")); // Метод класса колекшонс, который найдет
        //кол-во повторов. Передается коллекция, а затем обьект.
    }
}
