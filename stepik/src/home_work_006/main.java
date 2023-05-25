package home_work_006;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
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
    public static void main(String[] args) {
        //Коллекция ноутбуков:
        Set<Notebook> noteSet = new HashSet<>();
        //Заполняю коллекцию:
        noteSet.add(new Notebook(4000, 500, "Mac", "white", "Apple"));
        noteSet.add(new Notebook(6000, 800, "Win10", "red", "HP"));
        noteSet.add(new Notebook(8000, 3000, "Linux", "blue", "Asus"));
        noteSet.add(new Notebook(12000, 1000, "Win11", "green","Sony"));
        noteSet.add(new Notebook(16000, 2000, "Linux", "blue","Acer"));

        noteFiltr(noteSet, myfilter());
    }

    public static void noteFiltr(Set<Notebook> noteSet, Notebook filtNote) {
        for (Notebook i: noteSet) {
            if(i.getModel().contains(filtNote.getModel()) &&
                    i.getColor().contains(filtNote.getColor()) &&
                    i.getModel().contains(filtNote.getModel()) &&
                    i.getOS().contains(filtNote.getOS()) &&
                    i.getHdd() >= filtNote.getHdd() &&
                    i.getRam() >= filtNote.getRam()) {
                System.out.println(i);
            }
        }
    }

    private static Notebook myfilter() {
        Notebook filtNote = new Notebook(0, 0, "", "", "");
        Scanner sc = new Scanner(System.in);
        boolean isStart = true;
        while (isStart) {
            System.out.println("Выберите параметры фильтра:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Жесткий диск");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Модель");
            System.out.println("0 - Получить список");
            switch (sc.nextInt()) {
                case 1:
                    filtNote.setRam(Integer.parseInt(myvalue("ОЗУ")));
                    break;
                case 2:
                    filtNote.setHdd(Integer.parseInt(myvalue("Жесткий диск")));
                    break;
                case 3:
                    filtNote.setOS(myvalue("Операционная система"));
                    break;
                case 4:
                    filtNote.setColor(myvalue("Цвет"));
                    break;
                case 5:
                    filtNote.setModel(myvalue("Модель"));
                    break;
                case 0:
                    isStart = false;
                    break;
                default:
                    break;
            }
        }
        return filtNote;
    }
    private static String myvalue(String arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Значение " + arg + ": ");
        return sc.nextLine();
    }

}

