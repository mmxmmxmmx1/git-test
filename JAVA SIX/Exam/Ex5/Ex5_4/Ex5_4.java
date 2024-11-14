// 第五章 第四題 正負數的絕對值
package Exam.Ex5.Ex5_4;

import java.util.Scanner;

public class Ex5_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個正或負整數:");
        while (!scn.hasNextInt()) {
            System.out.println("輸入錯誤請重新輸入");
            scn.next();
        }
        int num = scn.nextInt();
        if (num < 0) {
            System.out.println("你輸入的整數絕對值是:" + Math.abs(num));
        }
        if (num > 0) {
            System.out.println("你輸入的整數絕對值是:" + Math.abs(num));
        }
        scn.close();
    }
}