//第四章 練習題 4-11題
package Exam.Ex4.Ex4_11;

import java.util.Scanner;

public class Ex4_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件來讀取用戶輸入
        System.out.print("請輸入長方形的長度:");// 請求輸入長度
        int length = scn.nextInt();//讀取輸入的長度，並將結果存在變數 length 中
        System.out.print("請輸入長方形的寬度:"); // 請求輸入寬度
        int width = scn.nextInt();// 讀取輸入的寬度，並將結果存在變數 width 中
        int area = length * width; //length * width 算出面積
        System.out.println("長方形的面積為:" + area); //計算出length * width的面積，並使用 println輸出 
        scn.close();// 關閉 Scanner 物件，釋放資源
    }
}