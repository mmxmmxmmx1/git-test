package Exam.Ex4.Ex4_9;

import java.util.Scanner;

public class Ex4_9 {
    public class test1 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件來讀取用戶輸入
            System.out.print("請輸入華氏溫度:");// 提示用戶輸入華氏溫度
            float temp = scn.nextFloat();// 讀取用戶輸入的華氏溫度並將其存儲在變數 temp 中
            float temp1 = (5 / (float) 9) * (temp - 32);// 將華氏溫度轉換為攝氏溫度，並將結果存在變數 temp1 中
            System.out.printf("%.2f", temp1);
            scn.close();// 關閉 Scanner 物件，釋放資源
        }
    }
}
