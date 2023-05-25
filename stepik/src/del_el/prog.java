package del_el;

import java.util.ArrayList;
import java.util.Scanner;

public class prog {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> myArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            myArray.add(String.valueOf(i));
        }
        int m = sc.nextInt();
        myArray.remove(m);

        for (String i: myArray) {
            System.out.print(i + " ");
        }
    }
}
