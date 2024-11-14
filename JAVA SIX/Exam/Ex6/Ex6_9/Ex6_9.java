//第六章 6-9 找出2開始的前10個質數
package Exam.Ex6.Ex6_9;

public class Ex6_9 {
    public static void main(String[] args) {
        int[] primes = new int[10]; // 創建一個陣列來存儲前10個質數
        int number = 2; // 從2開始尋找質數
        int count = 0; // 已找到的質數數量

        while (count < 10) { // 繼續尋找直到找到10個質數
            boolean isPrime = true; // 假設當前數字是質數

            // 檢查數字是否為質數
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // 如果找到其他因子，則不是質數
                    break;
                }
            }

            if (isPrime) { // 如果是質數，將它加入到陣列中
                primes[count] = number;
                count++; // 增加已找到的質數數量
            }
            number++; // 檢查下一個數字
        }

        // 打印陣列中的質數
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
