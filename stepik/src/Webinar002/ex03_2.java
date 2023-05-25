package Webinar002;

public class ex03_2 {
    public static void main(String[] args) {
        //Напишите метод, который принимает на вход строку(String) и
        //определяет является ли строка палиндромом(возвращает boolean значение).
        System.out.println(isPol("t1set"));
    }
    static boolean isPol(String arg){
        return arg.equalsIgnoreCase(new StringBuilder(arg).reverse().toString());
    }
}
