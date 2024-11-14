//第七章 習題 7-11 最大公因數
package Exam.Ex7.Ex7_11;

public class Ex7_11 {
    public static void main(String[] args) {
        int m = 16;
        int n = 12;
        int result = gcd(m, n);
        System.out.print("最大公因數是：" + result + "\n");
    }

    public static int gcd(int m, int n) {
        for (int k = m; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                return k;
            }
        }
        return 0;
    }
}
