//第七章 習題 7-27 使用函數計算1+2+3+...+n的值
//chatgpt給的答案
package Exam.Ex7.Ex7_27;

public class Ex7_27 {
    public static void main(String[] args) {
        int result = sum(100); // 計算 1 到 100 的和
        System.out.println("The sum of 1 to 100 is: " + result);
    }

    // 遞迴函數 sum(n) 的實現
    public static int sum(int n) {
        if (n == 1) {
            return 1; // 遞迴的基礎情況：當 n 等於 1 時，返回 1
        } else {
            return n + sum(n - 1); // 遞迴的一般情況：返回 n 加上前一個數的和
        }
    }
}
