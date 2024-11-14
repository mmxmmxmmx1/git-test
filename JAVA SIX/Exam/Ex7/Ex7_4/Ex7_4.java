//第七章 習題 7-4 1+2+3.......+n 的總和數
package Exam.Ex7.Ex7_4;

public class Ex7_4 {
    public static void main(String[] args) {
        int n = sum(10);
        System.out.println(n);
    }

    public static int sum(int k) {
        if (k > 1)
            return k + sum(k - 1);
        else
            return 1;

    }
}
