package Lecthion_002;

public class ex01 {
    public static void main(String[] args) {
        //Базовые API, строки и логировиние.
        //Посмотрим на строки
//        String st = "";
//        for (int i = 0; i < 1000_000; i++) {
//            st = st + "*";
//        }
//        System.out.println(st);

        //Попробуем тоже самое но с StringBuilder
        var t = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(sb); // работает в тысячи раз бысрее
        System.out.println(System.currentTimeMillis() - t);
    }
}
