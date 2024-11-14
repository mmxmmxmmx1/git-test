//第七章 習題7_10  計算整數n之內的質數有哪些
package Exam.Ex7.Ex7_10;

public class Ex7_10 {
    public static void main(String[] args) {
        primes(20); // 呼叫函數並印出小於等於20的所有質數
    }

    public static void primes(int n) {
        // 使用一個boolean陣列來標記可能的質數
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // 初始化，假設所有數都是質數
        }

        // 使用篩法去除非質數
        for (int factor = 2; factor * factor <= n; factor++) {
            if (isPrime[factor]) { // 如果factor是質數，則其倍數不是質數
                for (int j = factor * factor; j <= n; j += factor) {
                    isPrime[j] = false; // 標記倍數不是質數
                }
            }
        }

        // 印出所有質數
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + (i == n ? "\n" : ", "));
            }
        }
    }
}
