package Lecthion_002;
import java.io.IOException;
import java.util.logging.*;

public class ex05 {
    public static void main(String[] args) throws Exception {
        //логирование в файл
        Logger logger = Logger.getLogger(ex05.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);

        //log.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
