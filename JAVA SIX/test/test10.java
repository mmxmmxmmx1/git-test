//第六章 習題 6-14 元素平方
package test;

public class test10 {
    public static void main(String[] args) {
        // 初始二維陣列
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

        // 輸出原始陣列
        System.out.println("Original array:");
        printArray(arr);

        // 對每個元素進行平方計算
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] * arr[i][j]; // 平方運算
            }
        }

        // 輸出平方後的陣列
        System.out.println("Squared array:");
        printArray(arr);
    }

    // 用於輸出陣列內容的函數
    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
