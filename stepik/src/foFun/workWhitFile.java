package foFun;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.net.SocketTimeoutException;

public class workWhitFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во повторений: ");
        int size = sc.nextInt();
        sc.nextLine();
        //System.out.print("Что вывести: ");
        //String word = sc.nextLine();
        String fileName = "myFile.txt";
        File myFile = new File(fileName);
        try {
            FileWriter fw = new FileWriter(myFile, false);
            for (int i = 0; i < size; i++) {
                fw.write(sc.nextLine());
                fw.write("\n");
            }
            fw.close();
            System.out.println("Запись закончена успешно.");
        } catch (Exception e) {
            System.out.println("Возникла ошибка.");
            }
    }
}
