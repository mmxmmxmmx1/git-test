//第五章 第六題 5-6 奇數與偶數
package Exam.Ex5.Ex5_6;

import java.util.Scanner;

public class Ex5_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸一個整數: ");
        long num = scn.nextLong();
        if (num % 2 == 0) {
            System.out.println(num + " 是偶數");
        } else {
            System.out.println(num + " 是奇數");
        }
        scn.close();
    }
}
