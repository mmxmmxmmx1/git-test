//第七章 習題 7-3 鍵入任意數值算出3次方的值
package Exam.Ex7.Ex7_3;

public class Ex7_3 {
    public static void main(String[] args) {
        int x = cubic(5);
        System.out.println(x);

    }

    public static int cubic(int b) {
        return b * b * b;
    }
}
