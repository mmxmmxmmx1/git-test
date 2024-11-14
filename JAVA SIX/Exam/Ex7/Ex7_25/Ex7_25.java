//第七章 習題 7-25 費式數列 (a)
package Exam.Ex7.Ex7_25;

public class Ex7_25 {
    public static long fib(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        long result = (fib(6));
        System.out.println(result);

    }

}
