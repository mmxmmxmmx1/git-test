//第七章 習題 7-25 費式數列 (c)
package Exam.Ex7.Ex7_25_c;

import java.util.Scanner;

public class Ex7_25_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入費式數列的項數:");
        long n = scanner.nextLong(); // 從使用者讀取費式數列的項數

        if (n <= 0) {
            System.out.print("請輸入一個正整數。");
        } else {
            System.out.print("費式數列的前 " + n + " 項為:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        scanner.close();
    }

    // 使用迭代方法計算費式數列的第 n 項
    public static long fibonacci(long n) {
        if (n <= 1)
            return n; // 如果 n 為 0 或 1，直接返回 n

        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b; // 計算當前項
            a = b; // 更新前兩項
            b = sum;
        }
        return b; // 返回計算結果
    }
}
