//Ex13_18
package Exam.Ex13.Ex13_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 自訂例外類別: 當 n 小於 0 時拋出的例外
class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String message) {
        super(message); // 呼叫父類別(Exception)的建構子，設定例外訊息
    }
}

public class Ex13_18 {
    // 計算 n 的平方根，如果 n 小於 0，則拋出 ArgumentOutOfBound 例外
    public static void mySqrt(int n) throws ArgumentOutOfBound {
        // 檢查 n 是否小於 0
        if (n < 0) {
            // 拋出自訂的 ArgumentOutOfBound 例外，並附帶訊息 "n 小於 0"
            throw new ArgumentOutOfBound("n 小於 0");
        } else {
            // 計算並輸出 n 的平方根
            double sqrtResult = Math.sqrt(n);
            System.out.println("Square root of " + n + " is: " + sqrtResult);
        }
    }

    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 從標準輸入讀取使用者輸入
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入整數數字: ");
        try {
            // 讀取使用者輸入並將其轉換為整數
            int n = Integer.parseInt(reader.readLine());
            // 呼叫 mySqrt 函數，計算並輸出平方根
            mySqrt(n);
        } catch (ArgumentOutOfBound e) {
            // 捕獲並處理 ArgumentOutOfBound 例外，輸出例外訊息
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // 捕獲並處理 NumberFormatException 例外，輸出錯誤訊息
            System.out.println("輸入的不是一個有效的整數");
        } finally {
            // 關閉 BufferedReader，釋放資源
            reader.close();
        }
    }
}
