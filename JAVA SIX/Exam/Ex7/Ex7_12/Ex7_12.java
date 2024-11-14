//第七章 習題 7-12 最小公倍數
package Exam.Ex7.Ex7_12;

public class Ex7_12 {
    public static void main(String[] args) {
        int m = 16;
        int n = 12;
        int gcd = gcd(m, n);
        int lcm = lcm(m, n, gcd);
        System.out.println("最小公倍數：" + lcm);
    }

    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static int lcm(int m, int n, int gcd) {
        return (m / gcd * n);

    }
}