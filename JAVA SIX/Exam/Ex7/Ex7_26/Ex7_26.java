//第七章 習題 7-26 函數遞迴回傳a數的n次方
package Exam.Ex7.Ex7_26;

public class Ex7_26 {
    public static double power(double i, int j) {
        double total = Math.pow(i, j);
        return total;
    }

    public static void main(String[] args) {
        double a = 5.0;
        int b = 3;
        double sum = power(a, b);
        System.out.println("平方值為: " + sum);

    }
}
