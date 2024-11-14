//第五章 練習第19題 5-19 while寫99乘法
package Exam.Ex5.Ex5_19;

public class Ex5_19 {
    public static void main(String[] args) {
        int a = 2;
        while (a < 10) {
            int b = 1;
            while (b < 10) {
                System.out.print(String.format("%2d*%2d=%2d", a, b, a * b));
                b++;
            }
            System.out.println();
            a++;
        }
    }
}