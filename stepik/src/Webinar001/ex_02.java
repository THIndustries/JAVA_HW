package Webinar001;

import java.util.Random;

public class ex_02 {
    public static void main(String[] args) {
        //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        Random randnum = new Random();
        int[] arr = new int[randnum.nextInt(5,15+1)];
        for(int i =0; i < arr.length; i++) {
            arr[i] = randnum.nextInt(0,2);
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int curr_count = 0;
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                curr_count++;
            } else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                }
                curr_count = 0;
            }
            if (curr_count > max_count) {
                max_count = curr_count;
            }
        }
        System.out.println(max_count);
    }
}
