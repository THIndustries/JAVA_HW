package Webinar001;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        //дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть исла, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несоколько (или все) элементов массива должны быть отличны от заданного, а
        //остальные - равны ему.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[] {3,2,1,3,};
        int index = 0;
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length) {
            nums[index++] = val;
        }
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }
}
