package Lecthion_004;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        /*
1. Разобраться, зачем нужно столько коллекций и JCF
2. LinkedList и особенности работы с ним
3. Узнать о списках, как об абстрактной структуре
4. Проблемы работы со списками и массивами
5. Построение разных Queue и как в этом помогает JCF
6. Deque и логика использования этой коллекции
7. То, что мертво, умереть не может – Stack в контексте JCF
         */

        /*
        LinkenLins предствляет из себя двусвязный список

         */
        LinkedList<Integer> ll = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(23);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
