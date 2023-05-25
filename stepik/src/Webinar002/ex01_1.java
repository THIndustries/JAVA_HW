package Webinar002;

public class ex01_1 {
    public static void main(String[] args) {
        int n = 10;
        String c1 = "a", c2 = "b";
        StringBuilder res = func(n,c1,c2);
        System.out.println(res.toString());
    }

    public static StringBuilder func(int arg, String arg2, String arg3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arg/2; i++) {
            sb.append(arg2+arg3);
        }
        return sb;
    }

}
