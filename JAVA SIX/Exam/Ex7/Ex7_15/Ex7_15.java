//第七章 習題 7-15 兩數相比回傳較小的數值
package Exam.Ex7.Ex7_15;

public class Ex7_15 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int min = min(a, b);
        System.out.println(min);
    }

    public static int min(int a, int b) {
        if (a < b && b > a) {
            return a;
        } else {
            return b;
        }
    }
}
