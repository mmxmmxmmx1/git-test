//第五章 第九題 5-9 學生成績
package Exam.Ex5.Ex5_9;

import java.util.Scanner;

public class Ex5_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入學生成績:");
        int sum = scn.nextInt();
        if (sum >= 80 && sum <= 100) {
            System.out.println(sum + " :A級");
        }
        if (sum >= 60 && sum <= 79) {
            System.out.println(sum + " :B級");
        }
        if (sum >= 0 && sum <= 59) {
            System.out.println(sum + " :C級");
        } else {
            System.out.println("數字輸入錯誤，重新輸入一次");
        }
        scn.close();
    }
}
