package Webinar_003_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Вебинар с Константином
        List<Integer> list/*ссылка на обьект*/ = new ArrayList<>(); /*реальный обьект, который хранится в памяти*/
        int a = 5;
        test(list, a);
        System.out.println(list);
        System.out.println(a);
    }

    static void test(List<Integer> list, int num) {
        //Тут важно запомнить, что в параметры метода мы отправили ссылку на лист, который хранится в куче, не сам лист.
        //А вот примитивы, вроде int - передаются не по ссылке, а по значению.
        //Т.е. - не смотря на то что метод void (ничего не возвращающий), изменения в листе будут сохранены в любом случае.
        list.add(10);
        num++;
    }
}
