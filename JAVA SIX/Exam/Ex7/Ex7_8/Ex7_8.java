//第七章 習題7_8 計算a的因數有哪些 自己寫
package Exam.Ex7.Ex7_8;

public class Ex7_8 {
    public static void main(String[] args) {
        int a = 20;
        factors(a);
    }

    public static void factors(int k) {
        System.out.print("a的因數有: ");
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                System.out.print(+i + " ");
            }
        }
    }
}
