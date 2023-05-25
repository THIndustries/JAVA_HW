package Lection_001_2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("D:\\text\\text.txt", true);
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.append('\n');
            fw.write(sc.nextLine());
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
