package test;

public class test4 {
    public static void main(String[] args) {
        int a = 2;
        while (a < 10) {
            int b = 1;
            while (b < 10) {
                System.out.print(String.format("%2d*%d=%2d", a, b, a * b));
                b++;
            }
            System.out.println();
            a++;
        }
    }
}