//第九章 習題 9-7 Summation
package Exam.Ex9.Ex9_7;

class Summation {
    static void add(int n) {
        int sum = 0;
        for (int a = 1; a <= n; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}

public class Ex9_7 {
    public static void main(String[] args) {
        Summation.add(5);
        Summation.add(10);
    }
}
