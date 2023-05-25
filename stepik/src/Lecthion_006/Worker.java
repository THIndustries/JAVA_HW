package Lecthion_006;

public class Worker {
    //Описываем наши поля
    int id;//id ссотвественно
    int salary; // зарплата
    String firstName;// Имя
    String lastName;//Фамилия

    @Override
    public String toString() {
        //переопределили базовое поведение метода toString, так как нужно нам.
        return String.format("id: %d Name: %s Last_name: %s Salary: %d", id, firstName, lastName, salary);
    }
    //Меняем базовое поведение сравнивания экземпляров и переопределяем хэш-код


    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj; //сохраняем пришедший обьект в переменную и приводим к классу воркер.
        return id == t.id && firstName == t.firstName;//если id текущего воркера совпадает с "пришедшим" и
        //если имя текущего равно "пришедшему", верни правду. Это наш equals. Он для примера и не серьезен.
    }

    @Override
    public int hashCode() { //в качестве хэша будем использовать id, это пример и на практике так не делают.
        return id;
    }
}


