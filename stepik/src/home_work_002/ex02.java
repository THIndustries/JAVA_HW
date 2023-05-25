package home_work_002;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ex02 {
    public static void main(String[] args) {
        //Дана строка (получена через обычный текстовый файл)
        //"фамилия":"Иванов","оценка":"5","предмет":"Математика"
        //"фамилия":"Петров","оценка":"4","предмет":"Информатика"
        //Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
        //Студент [фамилия] получил [оценка] по предмету [предмет].
        //Пример вывода в консаль:
        //Студент Иванов получил 5 по предмету Математика.
        //Студент Петров получил 4 по предмету Информатика.
        String file_name = "fileStudent.txt";
        File myFile = new File(file_name);
        try {
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            StringBuilder sb = new StringBuilder();
//            char[] a = new char[(int)myFile.length()];
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            fr.close();
            String result = sb.toString();
            System.out.println("Запись прошла успешно!");
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Возникла ошибка.");
        }
    }
}
