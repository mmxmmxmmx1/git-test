//第七章 習題 7-16 陣列元素中的奇數有幾個
package Exam.Ex7.Ex7_16;

public class Ex7_16 {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 9, 12, 47, 55, 10 };
        System.out.println(odd(arr));
    }

    public static int odd(int[] a) {
        int count = 0;
        for (int num = 0; num < a.length; num++) {
            if (num % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
