package Lection_001_2;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("D:\\text\\streamFOS.txt"));
            String line = sc.nextLine();
            System.out.println(line);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
