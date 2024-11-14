//Ex13_17  小於0拋出IntegerlessThanZero並顯示"您輸入的整數的值小於0" 
//大於0拋出IntegerGreaterThanZero並顯示"您輸入的整數的值大於0"
//等於0拋出IntegerEqualToZero並顯示"您輸入的整數的值為0"
package Exam.Ex13.Ex13_17;

import java.util.Scanner;

// 自訂例外類別: 整數小於零的例外
class IntegerlessThanZero extends Exception {
    public IntegerlessThanZero(String message) {
        super(message); // 呼叫父類別(Exception)的建構子，設定例外訊息
    }
}

// 自訂例外類別: 整數大於零的例外
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String message) {
        super(message); // 呼叫父類別(Exception)的建構子，設定例外訊息
    }
}

// 自訂例外類別: 整數等於零的例外
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String message) {
        super(message); // 呼叫父類別(Exception)的建構子，設定例外訊息
    }
}

public class Ex13_17 {
    public static void main(String[] args) throws IntegerlessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        Scanner scn = new Scanner(System.in); // 建立 Scanner 物件以讀取輸入
        System.out.print("請輸入整數數字:"); // 提示用戶輸入整數
        int s = scn.nextInt(); // 讀取用戶輸入的整數

        try {
            // 判斷整數的值並拋出相應的例外
            if (s < 0) {
                throw new IntegerlessThanZero("您輸入的整數的值小於0");
            } else if (s > 0) {
                throw new IntegerGreaterThanZero("您輸入的整數的值大於0");
            } else {
                throw new IntegerEqualToZero("您輸入的整數的值為0");
            }
        } catch (IntegerlessThanZero e) {
            System.out.println(e.getMessage()); // 捕獲並顯示整數小於零的例外訊息
        } catch (IntegerGreaterThanZero e) {
            System.out.println(e.getMessage()); // 捕獲並顯示整數大於零的例外訊息
        } catch (IntegerEqualToZero e) {
            System.out.println(e.getMessage()); // 捕獲並顯示整數等於零的例外訊息
        } finally {
            scn.close(); // 關閉 Scanner 物件以釋放資源
        }
    }
}
