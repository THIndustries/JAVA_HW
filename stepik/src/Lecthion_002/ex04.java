package Lecthion_002;
import java.io.IOException;
import java.util.logging.*;
public class ex04 {
    public static void main(String[] args) {
        //логирование
        Logger logger = Logger.getLogger(ex04.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);

        //log.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");


    }
}
