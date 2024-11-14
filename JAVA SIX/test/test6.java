package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pwd = "6128";
        int count = 0;
        for (int a = 0; a < 3; a++) {
            System.out.print("請輸入密碼:");
            String key = scn.nextLine();
            if (key.equals(pwd)) {
                System.out.printf("密碼輸入正確，歡迎使用本系統 !");
                break;
            } else {
                count++;
                System.out.println("密碼輸入錯誤，請重新輸入密碼:");
            }
            if (count == 3) {
                System.out.print("密碼輸入錯誤超過三次 !");
                break;
            }
        }
        scn.close();
    }
}
