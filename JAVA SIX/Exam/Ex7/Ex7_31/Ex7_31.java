//第七章 習題 7-31 用函數算出int跟陣列的最小值
package Exam.Ex7.Ex7_31;

public class Ex7_31 {
    public static int smallest(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int ab;
        int c;
        ab = smallest(8, 9);
        c = smallest(new int[] { 12, 7, 32, 67 });
        System.out.println("a跟b中較小的值是:" + ab);
        System.out.print("陣列中最小的值是:" + c);
    }
}
