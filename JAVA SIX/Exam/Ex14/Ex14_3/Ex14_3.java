// Ex14_3 輸入一個整數 n , 然後計算 1 + 2 + ... + n
package Exam.Ex14.Ex14_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_3 {
    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 來讀取使用者輸入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 提示使用者輸入一個整數
        System.out.print("請輸入一個整數: ");
        
        // 讀取使用者輸入的字串並存入變數 str 中
        String str = br.readLine();
        
        // 將字串轉換為整數
        int num = Integer.parseInt(str);
        
        // 初始化 sum 為 0，用於存儲計算總和
        int sum = 0;
        
        // 使用 for 迴圈計算從 1 到 num 的所有整數的總和
        for (int i = 1; i <= num; i++) {
            sum += i; // 將當前的 i 加到 sum 中
        }
        
        // 輸出計算結果
        System.out.println(sum);
        
        // 關閉 BufferedReader
        br.close();
    }
}
