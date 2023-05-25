package Webinar_005;

public class ex0 {
    /*
    Создать структуру для хранения номеров паспортов Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
    Вывести данные по сотрудникам с фамилие Иванов.
     */
    public static void main(String[] args) {
        ex();
    }

    static void ex() {
        Pasports pass = new Pasports(); //Создаем или инициализируем наш класс.
        pass.add("123456", "Иванов");
        pass.add("321456", "Васильев");
        pass.add("234561", "Петрова");
        pass.add("234432", "Иванов");
        pass.add("654321", "Петрова");
        pass.add("345678", "Иванов");

        System.out.println(pass.get("234561"));//Вызываем наш класс через переменную, к которой его привязали.
        System.out.println();
        System.out.println(pass.getAll());
        System.out.println();
        System.out.println(pass.getByLastName("Иванов"));

    }
}
