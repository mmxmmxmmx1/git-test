//第七章 習題 7-22 算陣列內元素的平均值
package Exam.Ex7.Ex7_22;

public class Ex7_22 {
    public static void main(String[] args) {
        double[][] arr = { { 2, 4, 6 }, { 1, 3, 5 }, { 8, 9 } };
        System.out.println(mean(arr));
    }

    public static double mean(double[][] arr) {
        int count = 0;
        double total = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[k].length; j++) {
                total += arr[k][j];
                count++;
            }
        }
        return total / count;
    }
}
