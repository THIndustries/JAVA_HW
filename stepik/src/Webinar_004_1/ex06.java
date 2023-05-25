package Webinar_004_1;

public class ex06 {
    /*
    Реализовать стек с помошью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
     */
    public static void main(String[] args) {
        ex();
    }

    static void ex() {
        MyStack stack = new MyStack(); //Мы создали свой класс со своим функционалом и теперь пользуемся им.
        stack.push(10);
        stack.push(11);
        stack.push(1);
        stack.push(12);
        stack.push(45);
        stack.push(10);
        stack.push(11);
        stack.push(1);
        stack.push(12);
        stack.push(45);
        stack.push(10);
        stack.push(11);
        stack.push(1);
        stack.push(12);
        stack.push(45);
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
