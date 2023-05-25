package Webinar003;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex02 {
    //Заполнить список названиями планет солнечной системы в произвольном пордяке с повторениями
    //Вывести название каждой планеты и количество его повторений в списке.
    //земля, юпитер, Сатурн, марс, земля, юпитер
    public static void main(String[] args) throws Exception {

        Logger log = Logger.getLogger(ex02.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        log.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        log.info("StringArray: " + planets);
        ArrayList<String> mylist = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            mylist.add(String.valueOf(planets[rand.nextInt(planets.length)]));
        }
        log.info("mylist: " + mylist);
        System.out.println(mylist);
        long time = System.nanoTime(); //создаем счетчик.

        int count = 0;
        for (String i: planets) {
            for (String j: mylist) {
                if(i.equals(j)) count++;
            }
            if(count != 0) System.out.printf("%s: %d \n", i, count);
            log.info("res mylist: " + i + count);
            count = 0;
        }
/*
        int count = 1;
        mylist.sort(null);
        for (int i = 0; i < mylist.size() - 1; i++) {
            if (String.valueOf(mylist.get(i)) == String.valueOf(mylist.get(i + 1))) {
                count++;
            } else {
                System.out.printf("%s: %d \n", mylist.get(i), count);
                count = 1;
            }
        }
        System.out.printf("%s: %d \n", mylist.get(mylist.size() -1), count);
        */
        //log.info("sort mylist: " + mylist);
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time / 1_000_000.0);

    }
}
