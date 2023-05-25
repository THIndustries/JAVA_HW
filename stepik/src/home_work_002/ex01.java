package home_work_002;

import java.io.FileWriter;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //Реализуйте алгоритм сортировки узырьком числового массива (введен вами),
        //результат после каждой итерации запишите в лог-файл.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt(); //запрашию размер
        int[] arr = new int[size]; //обьявляю массив
        //заполняю массив
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите %d-й эллемент: ", i+1);
            arr[i] = sc.nextInt();
        }
        bublSort(arr);
    }
    public static void bublSort(int[] arr) {
        int n = arr.length;
        boolean isSwap = false;
        try {
            FileWriter fr = new FileWriter("myLog.txt");
            for (int i = 0; i < n-1; i++) {
                isSwap = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        isSwap = true;
                        fr.write(arrToStr(arr));
                    }
                    fr.write("\n");
                }
                if (!isSwap) break;
            }
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String arrToStr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}