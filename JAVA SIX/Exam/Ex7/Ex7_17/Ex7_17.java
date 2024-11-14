//第七章 習題 7-17 找出陣列中最小的值
package Exam.Ex7.Ex7_17;

public class Ex7_17 {
    public static void main(String[] args) {
        int[] arr = { 75, 29, 38, 45, 16 };
        System.out.println("陣列中最小元素是：" + min(arr));
    }

    public static int min(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }

        }
        return max;
    }
}
