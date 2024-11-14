////第七章 習題 7-23 陣列內元素的平方
package Exam.Ex7.Ex7_23;

public class Ex7_23 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }, { 8, 9, 2 } };
        square(arr);
    }

    public static void square(int[][] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[k].length; j++) {
                System.out.println(arr[k][j]);

            }
        }
    }
}
