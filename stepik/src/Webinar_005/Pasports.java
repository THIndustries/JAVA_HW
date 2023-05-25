package Webinar_005;

import java.util.HashMap;
import java.util.Map;

public class Pasports {
    private Map<String, String> map = new HashMap<>();

    void add(String pasNum, String lastName) {//Наш метод, который будет добавлять K V в наш HashMap
        map.put(pasNum, lastName);//Добавляем
    }

    String get(String pasNum) { //Возвращаем значение по ключу
        return pasNum + ": " + map.get(pasNum);//Возвращаем строку, куда войдет номер паспорта и фамилия, найденая по ключу.
    }

    String getByLastName(String lastName) {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry entry: map.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                sb.append(entry.getKey());//добавляем в строку ключь, извлекая с помощью map.entry
                sb.append(": ");//добовляем пробел
                sb.append(entry.getValue());//добавляем значение
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    String getAll() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry entry: map.entrySet()) {//В обьекте Мар есть метод, который возвращает нам множество обьектов.
            //Map.Entry хранит ключ-значение как один экземпляр
            sb.append(entry.getKey());//добавляем в строку ключь, извлекая с помощью map.entry
            sb.append(": ");//добовляем пробел
            sb.append(entry.getValue());//добавляем значение
            sb.append("\n");
        }
        return sb.toString();
    }

}
