//第四章 4-8題
package Exam.Ex4.Ex4_8;

import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件來讀取用戶輸入
        System.out.print("請輸入攝氏溫度:"); // 提示用戶輸入攝氏溫度
        float temp = scn.nextFloat(); // 讀取用戶輸入的攝氏溫度並將其存儲在變數 temp 中
        float temp1 = ((9 / (float) 5) * temp + 32); // 將攝氏溫度轉換為華氏溫度，並將結果存儲在變數 temp1 中
        System.out.printf("華氏溫度為:%.2f", temp1);// 輸出轉換後的華氏溫度，並使用 printf 格式化輸出，保留兩位小數

        scn.close(); // 關閉 Scanner 物件，釋放資源
    }
}