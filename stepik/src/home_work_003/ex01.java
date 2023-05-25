package home_work_003;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

    public class ex01 {

        public static void cuteNum(int size) throws IOException {

            Logger mylog = Logger.getLogger(ex01.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            mylog.addHandler(fh);
            SimpleFormatter form = new SimpleFormatter();
            fh.setFormatter(form);


            ArrayList<Integer> arrnum = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                arrnum.add(rand.nextInt(100));
            }
            mylog.info("Первый лист" + arrnum);
            System.out.printf("Изначальный лист: " + arrnum.toString() + "кол-во элементов: " + arrnum.size() + "\n");

            for (int i = size - 1; i > 0; i--) {
                if(arrnum.get(i) % 2 == 0) arrnum.remove(i);
            }
            mylog.info("Лист без четных чисел: " + arrnum);
            System.out.printf("Лист без четных чисел: " + arrnum.toString() + "кол-во элементов: " + arrnum.size());
        }

        public static void main(String[] args) {
            //Пусть дан произольный список целых чисел, удалить из него четные числа
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Введите кол-во эллементов: ");
                int size = sc.nextInt();
                cuteNum(size);
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }
