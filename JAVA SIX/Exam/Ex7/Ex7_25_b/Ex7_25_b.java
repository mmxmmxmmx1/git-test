//第七章 習題 7-25 費式數列 (b)
package Exam.Ex7.Ex7_25_b;

import java.util.Scanner;

public class Ex7_25_b {
    public static long fib_rec(long a) {
        if (a <= 1) {
            return a;
        }
        return fib_rec(a - 1) + fib_rec(a - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入費式數列第幾個值: ");
        long num = scn.nextLong();
        long sum = fib_rec(num);
        System.out.println(sum);
        scn.close();
    }
}