package home_work_001;

public class hw_02 {
    public static void main(String[] args) {
        //Вывести простые числа от 1 до 100
        for (int i = 2; i <= 100 ; i++) {
            boolean isSimp = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimp = false;
                    break;
                }
            }
            if(isSimp) {
                System.out.print(i + " ");
            }
        }
    }
}
