package Lecthion_005;

import java.util.HashMap;
import java.util.Map;

public class main {
    /*
    Множество коллекции Map
     */
    public static void main(String[] args) {
        //Map<Integer, String> db = new HashMap<>();
        Map<Integer, String> db = new HashMap<>(9, 1.0f);//в данном случае я обьявляю
        //массив на 9 элементов и обьявляю, что расширять его нужно только при заполнении на 100% (1.0f)
        db.putIfAbsent(1,"один"); //проверка на наличие ключа, если нету - добавить
        db.put(2, "два");// если тут повторить ключь, то значения перезапишутся
        db.put(null, "null!");
    }
}
