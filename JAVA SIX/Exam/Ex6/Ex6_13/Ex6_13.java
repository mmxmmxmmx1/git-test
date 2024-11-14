//第六章 習題 6-13  最小值的行跟列 索引

package Exam.Ex6.Ex6_13;

public class Ex6_13 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int minrow = -1;
        int mincol = -1;
        int[][] arr = { { 18, 21, 30 },
                { 40, 34, 61 },
                { 41, 15, 18 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[j][i]) {
                    min = arr[j][i];
                    mincol = i;
                    minrow = j;
                }
            }
        }
        System.out.print("最小值在第 " + minrow + " 行" + "第 " + mincol + " 列");
    }
}
