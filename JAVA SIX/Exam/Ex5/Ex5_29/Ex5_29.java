//第五章 習題 29 5-29  密碼正確進入系統，密碼錯誤三次，跳出錯誤訊息並離開系統
package Exam.Ex5.Ex5_29;

import java.util.Scanner;

public class Ex5_29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pwd = "6128";
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("請輸入密碼: ");
            String key = scn.nextLine();
            if (key.equals(pwd)) {
                System.out.print("密碼輸入正確，歡迎使用本系統!");
            } else {
                count++;
                System.out.println("密碼錯誤，請重新輸入密碼；");
            }
            if (count == 3) {
                System.out.print("密碼輸入錯誤超過三次!");
                break;
            }
        }
        scn.close();
    }
}
