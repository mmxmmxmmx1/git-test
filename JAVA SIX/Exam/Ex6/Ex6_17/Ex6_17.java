//第六章 習題 6-17 用for迴圈在三維陣列arr裡找到所有元素最小值
package Exam.Ex6.Ex6_17;

public class Ex6_17 {

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        int[][][] arr = { { { 15, 85, 36 }, { 30, 14, 37 },
                { 47, 23, 96 }, { 19, 39, 51 } },
                { { 22, 16, 51 }, { 97, 30, 12 },
                        { 68, 77, 26 }, { 57, 32, 76 } } };

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int o = 0; o < arr[i].length; o++) {
                for (int r = 0; r < arr[i][o].length; r++) {
                    System.out.print(arr[i][o][r] + " ");
                    if (num > arr[i][o][r]) {
                        num = arr[i][o][r];
                    }
                }
            }
        }
        System.out.println("\n所有元素的最小值是: " + num);
    }
}
