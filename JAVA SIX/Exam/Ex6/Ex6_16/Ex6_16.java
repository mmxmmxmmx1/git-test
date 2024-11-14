//第六章 習題 6-16  建立一個6*6的二維陣列

package Exam.Ex6.Ex6_16;

public class Ex6_16 {
    public static void main(String[] args) {
        int count = -1;
        int[][] arr = new int[6][6];
        for (int a = 0; a < arr.length; a++) {
            System.out.println();
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] < Integer.MAX_VALUE) {
                    count++;
                }
                System.out.printf("%4d", count);
            }
        }
    }
}