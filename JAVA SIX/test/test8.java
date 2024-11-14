// ch6_5 三維陣列找出最大值，自己想的找法 
// XX 這方法當全是負數的話就只會顯示0
package test;

public class test8 {
    public static void main(String[] args) {
        int max = 0;
        int[][][] arr = { { { 21, 32, 65 },
                { 78, 94, 76 },
                { -3, 44, 65 },
                { 89, 54, 73 } },
                { { 32, 56, 89 },
                        { 43, 23, 32 },
                        { 32, 56, 78 },
                        { 94, 78, 45 } } };
        for (int p = 0; p < arr.length; p++) {
            for (int r = 0; r < arr[p].length; r++) {
                for (int c = 0; c < arr[p][r].length; c++) {
                    if (max < arr[p][r][c]) {
                        max = arr[p][r][c];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
