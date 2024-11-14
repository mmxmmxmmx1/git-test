//第五章 第十一題 5-11 判斷工作或休假日
package Exam.Ex5.Ex5_11;

import java.util.Scanner;

public class Ex5_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一周1-7其中一個數:");
        int week = scn.nextInt();
        if (week >= 1 && week <= 5) {
            System.out.println("今天星期" + week + "要上班");
        }
        else if (week >= 6 && week <= 7) {
            System.out.print("今天星期" + week + "是放假日");
        } else {
            System.out.println("輸入數值非在1-7範圍內");
        }
        scn.close();
    }
}
