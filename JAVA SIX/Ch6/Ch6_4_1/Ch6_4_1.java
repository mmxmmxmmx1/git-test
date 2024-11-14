// Ch6_4 用for-each的寫法
package Ch6.Ch6_4_1;

public class Ch6_4_1 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] sales = { { 32, 35, 26, 30 }, { 34, 30, 33, 31 } };

        for (int[] row : sales) {
            for (int value : row) {
                System.out.print(value + " ");
                sum += value;
            }
            System.out.println();
        }
        System.out.printf("總銷售量為 %d 部車", sum);
    }
}