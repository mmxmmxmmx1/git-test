// Ex13_20 印出 0~n 之間的偶數數值
package Exam.Ex13.Ex13_20;

import java.io.IOException;
import java.util.Scanner;

// 自定義例外類別，當輸入值為奇數時拋出此例外
class NotEven extends Exception {
    public NotEven(String message) {
        super(message);
    }
}

public class Ex13_20 {

    // 方法 even: 印出從 2 到 n 的所有偶數
    // 如果 n 小於等於 0，拋出 IllegalArgumentException
    // 如果 n 是奇數，拋出 NotEven 例外
    public static void even(int n) throws NotEven, IOException {
        if (n <= 0) {
            throw new IllegalArgumentException("n值小於或等於0,無法處理");
        }
        if (n % 2 != 0) {
            throw new NotEven("n值為奇數,無法處理");
        }
        // 印出 2 到 n 之間的所有偶數
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

    // 主方法
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入數字來判斷是否為偶數:"); // 提示使用者輸入數字
        try {
            int x = scn.nextInt(); // 從鍵盤讀取輸入數字
            even(x); // 呼叫 even 方法來處理輸入數字
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 捕捉並處理 IllegalArgumentException
        } catch (NotEven e) {
            System.out.println(e.getMessage()); // 捕捉並處理 NotEven 例外
        }
        scn.close(); // 關閉 Scanner
    }
}
