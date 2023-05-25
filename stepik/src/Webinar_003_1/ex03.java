package Webinar_003_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex03 {
    public static void main(String[] args) throws Exception {
        /*
        Создать список типа ArrayList
        Поместить в него как строка, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        //ex02.createList(10, 1, 10); вызов метода из предыдушего класса.
        List list = new ArrayList(); //Создали без указания типа, по умолчинию там будет Object
        list.add(5);
        list.add(null);
        list.add("hello");
        list.add(3.2);
        list.add("1");
        list.add(-15);
        list.add("yes");
        System.out.println(list);
        removeInt2(list);
    }

    static void removeInt(List list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Number) {
                list.remove(i); // лучше удалять используя индекс, а не обращаясь к значению через get();
                i--;//После удаления, нужно предупредить перескакивание следующего элемента с помощью декремента.
                //иначе значения сместяться влево и мы перепрыгнем один элемент.
            }
        }
    }

    static void removeInt2(List list) throws IOException { //через итератор
        Iterator iter = list.iterator();//итератор, это обьект, который может перебрать эллементы. Это его фукция.
        //у него два метода - hasNext(), который говорит что есть ещё следущий элемент, есть что перебирать и метод
        //next(), который дает нам следущий элемент.

        Logger log = Logger.getLogger(ex03.class.getName());
        FileHandler fh = new FileHandler("ex03_log.txt", false);
        log.addHandler(fh);
        SimpleFormatter sm = new SimpleFormatter();
        fh.setFormatter(sm);

        while (iter.hasNext()) {
            Object obj = iter.next();
            if(obj instanceof Number) {
                iter.remove();//итератор может удалить методом ремув.
                log.info("Удаленный эллемент: " + obj + "\n");
            }
        }
        System.out.println(list);
    }

}


