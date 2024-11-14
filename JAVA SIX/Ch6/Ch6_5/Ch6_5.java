//Ch6_5 在三維陣列裡找出最大值
package Ch6.Ch6_5;

public class Ch6_5 {
    public static void main(String[] args) {
        int[][][] arr = { { { 21, 32, 65 },
                { 78, 94, 76 },
                { 79, 44, 65 },
                { 89, 54, 73 } },
                { { 32, 56, 89 },
                        { 43, 23, 32 },
                        { 32, 56, 78 },
                        { 94, 78, 45 } } };
        int p, r, c, max = arr[0][0][0];
        for (p = 0; p < arr.length; p++)
            for (r = 0; r < arr[p].length; r++)
                for (c = 0; c < arr[p][r].length; c++)
                    if (max < arr[p][r][c])
                        max = arr[p][r][c];
        System.out.println(max);
    }
}
