//第六章 習題 6-18 用for-each迴圈來完成6-17的題目
package Exam.Ex6.Ex6_18;

public class Ex6_18 {
    public static void main(String[] args) {
        int[][][] arr = {
                { { 15, 85, 36 }, { 30, 14, 37 }, { 47, 23, 96 }, { 19, 39, 51 } },
                { { 22, 16, 15 }, { 97, 30, 12 }, { 68, 77, 26 }, { 57, 32, 76 } }
        };

        // 初始化最小值為整數最大值
        int min = Integer.MAX_VALUE;

        // 使用 for-each 迴圈遍歷三維陣列
        for (int[][] twoDArray : arr) { // 遍歷每個二維陣列
            for (int[] oneDArray : twoDArray) { // 遍歷二維陣列中的每個一維陣列
                for (int value : oneDArray) { // 遍歷一維陣列中的每個值
                    if (value < min) { // 比較當前值與已記錄的最小值
                        min = value; // 更新最小值
                    }
                }
            }
        }
        // 輸出最小值
        System.out.println("所有元素的最小值是: " + min);
    }
}
