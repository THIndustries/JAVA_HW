package Lection_001;
import java.util.*;
import java.util.Objects;

//Урок 1.Знакомство с языком программирования Java
/*
структура самой простой программы:
 */
public class Main {
//    точка входа
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
         типы данных и переменные. типы данных бывают ссылочные и примитивные.
         ссылочные, это все что относится к классам или интерфейсам.
         примитивные - boolean, int, short, long и т.д.
        */
        String s = "test";
        s = s + " anoter text";
        System.out.println(s);
        //целые числа
        short age = 10;
        int salary = 123456; //int хранит 4 байта
        System.out.println(age);
        System.out.println(salary);
        //вещественные числа
        float e = 2.5f; //для типа float надо указывать суфикс f у значения
        double pi = 3.1415; //для double указывать суфикс не обязательно
        System.out.println(e);
        System.out.println(pi);
        //тип данных char
        char ch = 123; // неявное пребразование, из-за не указанного типа
        ch = '4';
        System.out.println(ch);
        for (int i = 0; i < 15; i++) {
            System.out.print('-');
        }
        System.out.println();
        var num = 341;
        System.out.println(getType(num));

        float num1 = 25f;
        int num2 = 3;
        System.out.println(num1/num2);
        int a = 10;
        a = --a - a;
        System.out.println(a);
        int b = 8;
        b = b << 1;
        System.out.println(b);
        int pobit_a = 5;
        int pobit_b = 2;
        System.out.print("Побитовая операция: ");
        System.out.println( pobit_a | pobit_b);
        //------------------------------------------------------
        //Массивы
        int[] arr = new int[10];
        System.out.println(arr.length);

        arr = new int[] {1,2,3,4,5};
        System.out.println(arr.length);
        int[] arr2 = new int[5];
        arr2 = new int[]{1,2,3,4,5};
        System.out.println(arr2[0]);

        int[] arr3 = new int[] {5,7,2,9};
        System.out.println(arr3[1]);

        //Многомерные массивы
        int[] array[] = new int[3][5];

        for (int[] row: array) {
            for (int item: row) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        int q = 123; double w = q;
        System.out.println(w);
        byte r = Byte.parseByte("123");
        System.out.println(r);
        int myNum = Integer.parseInt("53498");
        System.out.println(myNum);

        int num3 = 321;
        var num4 = Double.parseDouble("432.43");
        System.out.println(num4);
        float u = 1323.4f;
        int p = (int)u;
        System.out.println(p);

        Scanner sc = new Scanner(System.in);
//        System.out.printf("Имя: ");
//        String name = sc.next();
//        System.out.printf("Привет, %s!", name);
        System.out.println("--------------------------------------------------------------------");

        //проверка на соответствие получаемого типа
        System.out.print("input num: ");
        boolean flag = sc.hasNextInt();
        System.out.println(flag);
        int numi = sc.nextInt();
        System.out.println(numi);
        int z = 10, x = 5;
        int v = z+x;
        String mytext = String.format("%d + %d = %d", z,x,v);
        System.out.println(mytext);
        System.out.println("-------------------------------------------------------------------");
        {
            int randomNum = 321;
        }
        int random = 43432;
        {
            System.out.println(random);
        }
        //тернарный оператор
        int numq = 1, numw = 2;
        int max = numq > numw ? numq : numw;
        System.out.println(max);
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}
