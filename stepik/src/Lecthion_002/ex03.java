package Lecthion_002;

import java.io.File;

public class ex03 {
    public static void main(String[] args) {
        //работа с файлами
        try{ // тут пишем код, в котором может появиться ошибка
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File myFile = new File("D:\\text\\lecthion2.txt");
        } catch (Exception ex) { // обработка, если ошибка случилась

        }
        finally {
            //код, который выполнится в любом случае
        }
    }
}
