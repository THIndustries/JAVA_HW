package Webinar003;

import java.util.ArrayList;

public class ex03 {
    public static void main(String[] args) {
        //Сздать ArrayList. Поместить в него как строки, так и целые числа.
        //Пройти по списку, найти и удалить целые числа.
        ArrayList myArr = new ArrayList<>();// Если не указать тип, то по дефелту тип данных Object
        myArr.add(3);
        myArr.add("Дом");
        myArr.add(2);
        myArr.add("Улица");
        myArr.add(5);
        myArr.add("Глобус");
        System.out.println(myArr);

        for (int i = 0; i < myArr.size(); i++) {
            if(myArr.get(i) instanceof Integer) myArr.remove(i);
        }
        System.out.println(myArr);

    }
}
