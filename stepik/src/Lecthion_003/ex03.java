package Lecthion_003;

public class ex03 {
    //Расширяем исходный массив с помощью метода.
    static int[] AddItem(int[] array, int item) {
        int len = array.length;
        int[] temp = new int[len + 1];
        System.arraycopy(array, 0, temp, 0, len);
        temp[len] = item;
        return temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {0,9};
        for (int i: a) {
            System.out.printf("%d", i);
        }
        a = AddItem(a,2);
        a = AddItem(a, 3);
        for (int j: a) {
            System.out.printf("%d", j);
        }
    }
}
