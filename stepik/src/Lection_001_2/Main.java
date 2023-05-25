package Lection_001_2;
import java.io.*;

//Работа с файлами
public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с файлами.");

        String text = "Должно появиться две строки.";
        String n = "\n";
        StringBuffer sb = new StringBuffer();
        try {
            //Класс для считывания данных из файла FileinputStream
            FileInputStream fis = new FileInputStream("D:\\text\\streamFOS.txt");
            //Не все так просто, чтобы считать данные, надо считывать побитно!
            int i = -1;
            //метод .read - считывает побитно каждый символ в файле.
            while ((i = fis.read()) != -1) {
                sb.append((char) i);
                //данное условие подразумевает, что как только i == -1, символы в файле закончились.
//                System.out.print((char)i); //просто i будет возвращать код символа, поэтому надо применить
                //явное преобразование в char.
            }



            // класс для добавления чего-то в файл FileOutputStream
            /*
            FileOutputStream fos = new FileOutputStream("D:\\text\\streamFOS.txt", true);
            byte temp[] = n.getBytes();
            byte buf[] = text.getBytes();
            fos.write(temp);
            fos.write(buf);
            System.out.println("Запись завершена.");
            */

//            PrintStream prStr = new PrintStream("D:\\text\\stream.txt");
//            prStr.print(text);
//            prStr.print("\nнужно больше практиковаться.");
//            prStr.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(sb);

        /*
        try (FileWriter myFr = new FileWriter("Test_file.txt", false)) {
            myFr.write("line 1");
            myFr.append('\n');
            myFr.append('2');
            myFr.append('\n');
            myFr.write("line 3");
            myFr.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        */
    }
}
