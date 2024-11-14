//第五章 第12題 5-12 用switch判斷季節
package Exam.Ex5.Ex5_12;

import java.util.Scanner;

public class Ex5_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int month;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("請輸入1~12其中一個月份:");
            month = scn.nextInt();
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println(month + "月是春天");
                    validInput = true;
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month + "月是夏天");
                    validInput = true;
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month + "月是秋天");
                    validInput = true;
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println(month + "月是冬天");
                    validInput = true;
                    break;
                default:
                    System.out.println("您的輸入錯誤，請輸入1-12其中一個數字");
            }
        }
        scn.close();
    }
}
