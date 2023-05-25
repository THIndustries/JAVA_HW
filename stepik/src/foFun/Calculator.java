package foFun;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    public static void main(String[] args) throws Exception {
        //Реализовать простой калькулятор
        System.out.println("Welcome to my calculator!");
        long time = System.nanoTime();
        Object res = calc();
        System.out.println(res);
        time = System.nanoTime() - time;
        System.out.printf("Elapse %,9.3f ms\n", time/1_000_000.0);

    }

    static Object calc() throws Exception {

        Logger myLogg = Logger.getLogger(Calculator.class.getName());
        String logPath = "calcLog.txt";
        FileHandler fh = new FileHandler(logPath, false);
        myLogg.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ввете первый операнд: ");
        Object a = sc.nextDouble();
        //myLogg.info(String.valueOf(a));
        System.out.print("\nВведите операцию (+ - * /): ");
        char oper = sc.next().charAt(0);
        //myLogg.info(String.valueOf(oper));
        System.out.print("\nВведите второй операнд: ");
        Object b = sc.nextDouble();

        Object result = 0;
        switch (oper) {
            case '+':
                if(a instanceof Double && b instanceof Double) {
                    result = (Object)((Double)a + (Double)b);
                    //myLogg.info(String.valueOf(result));
                } else if (a instanceof Integer && b instanceof Integer) {
                    result = (Object)((Integer)a + (Integer)b);
                    //myLogg.info(String.valueOf(result));
                }
                break;
            case '-':
                if(a instanceof Double && b instanceof Double) {
                    result = (Object)((Double)a - (Double)b);
                    //myLogg.info(String.valueOf(result));
                } else if (a instanceof Integer && b instanceof Integer) {
                    result = (Object)((Integer)a - (Integer)b);
                    //myLogg.info(String.valueOf(result));
                }
                break;
            case '*':
                if(a instanceof Double && b instanceof Double) {
                    result = (Object)((Double)a * (Double)b);
                    //myLogg.info(String.valueOf(result));
                } else if (a instanceof Integer && b instanceof Integer) {
                    result = (Object)((Integer)a * (Integer)b);
                    //myLogg.info(String.valueOf(result));
                }
                break;
            case '/':
                if(a instanceof Double && b instanceof Double) {
                    result = (Object)((Double)a / (Double)b);
                    //myLogg.info(String.valueOf(result));
                } else if (a instanceof Integer && b instanceof Integer) {
                    result = (Object)((Integer)a / (Integer)b);
                    //myLogg.info(String.valueOf(result));
                }
                break;
            default:
                System.out.println("Вы ввели неправильную оперaцию");
                break;
        }
        myLogg.info(String.format("%s %s %s = %s", a, oper, b, result));
        return result;
    }
}



