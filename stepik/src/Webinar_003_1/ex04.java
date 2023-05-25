package Webinar_003_1;

import java.util.ArrayList;
import java.util.List;

public class ex04 {
    /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра,
    а на остальных позициях - название книг. Напишите метод для заполнения данной структуры.-
     */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>(); //инициализируем двумерный список. Обрати внимание, мы
        //инициализировали внешний List<>. Внутренний надо инициализировать отдельно.
        addBook(shopBook, "Детектив", "Шерлок Холмс");
        addBook(shopBook, "Детектив", "Убийство на Ниле");
        addBook(shopBook, "Фантастика", "Гарри Поттер");
        addBook(shopBook, "Роман", "Поющие в терновнике");
        addBook(shopBook, "Фантастика", "Дюна");
        addBook(shopBook, "Фантастика", "Властелин колец");
        addBook(shopBook, "Роман", "Белый клык");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String name) { //Метод для добавления новой книги.
        for (int i = 0; i < shopBook.size(); i++) {
            if(shopBook.get(i).get(0).equalsIgnoreCase(genre)) {
                List<String> list = shopBook.get(i);
                list.add(name);
                return; //остановит работу метода
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list); //добавляем лист в лист.
    }
}
