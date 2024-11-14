//第七章 習題 7-24 陣列內元素的平方，且arr內容不能被改變
//chatgpt解題
package Exam.Ex7.Ex7_24;

public class Ex7_24 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }, { 8, 9, 2 } };
        int[][] squaredArr = square(arr);

        // 打印返回的平方後陣列
        for (int[] row : squaredArr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 定義 square 函數，計算二維陣列的每個元素的平方
    public static int[][] square(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0][0]; // 如果輸入的陣列為空，則返回空陣列
        }

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] squaredArr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                squaredArr[i][j] = arr[i][j] * arr[i][j]; // 計算平方並賦值
            }
        }

        return squaredArr;
    }
}
