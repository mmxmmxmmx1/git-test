//第六章 習題 6-19 將arr陣列中的偶數改成0   自己做的題目
package Exam.Ex6.Ex6_19;

public class Ex6_19 {
    public static void main(String[] args) {
        int[][][] arr = { { { 82, 13, 21 }, { 49, 12, 6 } }, { { 4, 18, 30 }, { 50, 24, 62 } },
                { { 7, 9, 14 }, { 20, 43, 19 } }, { { 20, 68, 33 }, { 15, 17, 38 } } };
                System.out.print("三維arr陣列的原始值:");
        for (int a = 0; a < arr.length; a++) {
            System.out.println();
            for (int b = 0; b < arr[a].length; b++) {
                for (int c = 0; c < arr[a][b].length; c++) {
                    System.out.printf("%3d", arr[a][b][c]);
                }
            }
        }
        System.out.println();
        System.out.print("將arr陣列內的偶數改為0後的陣列內容:");
        for (int a = 0; a < arr.length; a++) {
            System.out.println();
            for (int b = 0; b < arr[a].length; b++) {
                for (int c = 0; c < arr[a][b].length; c++) {
                    if (arr[a][b][c] % 2 == 0) {
                        arr[a][b][c] = 0;
                        System.out.printf("%3d", arr[a][b][c]);
                    } else {
                        System.out.printf("%3d", arr[a][b][c]);
                    }
                }
            }
        }
    }
}