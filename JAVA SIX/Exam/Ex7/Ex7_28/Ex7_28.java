//第七章 習題 7-28 使用函數計算1*2+2*3+3*4...+(n-1)*n的合
package Exam.Ex7.Ex7_28;

public class Ex7_28 {
    // 这个方法计算 1*2 + 2*3 + ... + (n-1)*n
    public static int rsum(int k) {
        int total = 0;
        for (int j = 1; j < k; j++) {
            total = total + j * (j + 1); // 根据题目要求计算并累加
        }
        return total;
    }

    public static void main(String[] args) {
        int sum = rsum(5);
        System.out.println("加總數: " + sum);
    }
}
