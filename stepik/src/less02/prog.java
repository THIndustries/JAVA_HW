package less02;
//Очередь
//Напишите программу, которая реализует структуру данных очередь, используя список.
//Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции.
//Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции,
//которые будут играть далее.
//Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:
//
//push <Название трека> - добавляет трек в плейлист
//pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
//После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит
//из одного слова.
import java.util.ArrayList;
import java.util.Scanner;

public class prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> myList = new ArrayList<>();
        String text = null;
        for (int i = 0; i < n; i++) {
            String text1 = sc.next();
            if(text1.equalsIgnoreCase("push")){
                myList.add(sc.next());
            } if (text1.equalsIgnoreCase("pop")){
                text = myList.get(0);
                System.out.println("воспроизводится" + " " + text);
                myList.remove(0);
            }
        }
//        вывод
        System.out.println(String.join(" ", myList));
    }
}
