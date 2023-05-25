package Webinar_004_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex05 {
    /*
    Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стека
    Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
     */
    public static void main(String[] args) {
        ex0();
    }
    static void ex0() {
        Stack<Integer> stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
