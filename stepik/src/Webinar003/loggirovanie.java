package Webinar003;

import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggirovanie {
    public static void main(String[] args) throws Exception {
        //Логгирование принято писать внутри класса, который логгируется.
        Logger ll = Logger.getLogger(loggirovanie.class.getName());//Обрати внимание, логгер создается не
        //через конструктор new а сразу через его функционал. Совмещаем логгер с нынешним классом, который
        //он должен логгировать.
        String loggPath = "log.txt"; //пепеменная, в которой хранится путь до файла.
        FileHandler fh = new FileHandler(loggPath, false);//Создаем файловый менеджер,
        // который будет совмещать логер с файлом, чтобы он логгировал в него.
        //false - каждый раз логгфайл будет перезаписываться
        //true - логги будут добавляться.
        ll.addHandler(fh);//Связываем наш логгер с файлом.

        SimpleFormatter formatter = new SimpleFormatter();//два типа записи логгов
        //XMLFormatter formatter = new XMLFormatter();
        fh.setFormatter(formatter);//Указываем нашему FileHandler в каком формате ему работать.
        //Вот этот блок кода для логгера, по заверению лектора - стандартный шаблон логгера.
        //------------------------------------------------------------------------------------------
        Random rand = new Random();
        for (int i = 0; i < 10; i++) { //Циклом for записываем в логгер рандомные числа
            int a = rand.nextInt(10);
            //ll.log(Level.INFO,"element: ", a); //один из двух вариантов одного и тогоже
            ll.info("element: " + a); //один из двух вариантов одного и тогоже
        }
        ll.log(Level.WARNING,"logger off");
        ll.info("test");
        ll.warning("logsPath");
    }
}
