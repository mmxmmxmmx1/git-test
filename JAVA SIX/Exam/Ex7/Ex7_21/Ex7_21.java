//第七章 習題 7-21 陣列中最大與最小值的乘積
package Exam.Ex7.Ex7_21;

public class Ex7_21 {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 5 };
        System.out.println("陣列中最大與最小值的乘積：" + product(arr));
    }

    public static int product(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (min < arr[j]) {
                    min = arr[j];
                }
            }
        }
        return max * min;
    }
}
