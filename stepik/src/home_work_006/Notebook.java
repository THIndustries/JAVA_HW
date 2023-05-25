package home_work_006;

import java.util.HashMap;
import java.util.Map;
    /*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Работу сдать как обычно ссылкой на гит репозиторий
P.S. Частые ошибки смотри в конце семинара
     */

public class Notebook { //Мой класс, тут описываются будущие сущности. Тут не будет static
    private int ram;
    private int hdd;
    private String OS;
    private String color;
    private String model;


    private Map noteList = new HashMap();


    //Мой конструктор.
    Notebook (int ram, int hdd, String OS, String color, String model) {
        this.ram = ram;
        this.hdd = hdd;
        this.OS = OS;
        this.color = color;
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOS() {
        return OS;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ram: " + ram +", hdd: " + hdd + ", OS: " + OS + ", color: " + color + ", model: " + model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook note = (Notebook) obj;
        return ram == note.ram && hdd == note.hdd && OS.equals(note.OS) && color.equals(note.color) &&
                        model.equals(note.model);
    }

    @Override
    public int hashCode() {
        return OS.hashCode() + color.hashCode()* 7 + model.hashCode() * 11 + ram * 19 + hdd * 3;
    }
}
