//第七章 習題 7-19 找出陣列中最大值
package Exam.Ex7.Ex7_19;

public class Ex7_19 {
    public static void main(String[] args) {
        int[][] arr = { { 75, 89, 10 }, { 38, 45, 16 } };
        int result = max(arr);
        System.out.println(result);
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[k].length; j++) {
                if (arr[k][j] > max) {
                    max = arr[k][j];
                }
            }
        }
        return max;
    }
}
