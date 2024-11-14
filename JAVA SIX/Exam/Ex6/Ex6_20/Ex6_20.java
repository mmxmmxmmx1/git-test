//第六章 習題 6-20 把50跟50以上的陣列元素改成99
//做法跟6-19差不多
package Exam.Ex6.Ex6_20;

public class Ex6_20 {
    public static void main(String[] args) {
        int[][][] arr = {
            {
                {15, 50, 65},
                {38, 94, 25},
                {79, 44, 19},
                {89, 54, 73}
            },
            {
                {14, 90, 46},
                {43, 23, 67},
                {32, 56, 78},
                {94, 78, 40}
            }
        };

        // (a) 印出陣列內容
        System.out.println("原始的陣列內容:");
        for (int[][] matrix : arr) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // (b) 找出所有大於等於50的元素，並將該元素設為99
        for (int[][] matrix : arr) {
            for (int[] row : matrix) {
                for (int i = 0; i < row.length; i++) {
                    if (row[i] >= 50) {
                        row[i] = 99;
                    }
                }
            }
        }

        // (c) 印出修改後的陣列內容
        System.out.println("將數值50跟50以上的元素改成99:");
        for (int[][] matrix : arr) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

