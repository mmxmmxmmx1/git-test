package test;

public class test7 {
    public static void main(String[] args) {
        int[][] sales = { { 31, 12, 14, 11 },
                { 33, 34, 30 }, { 12, 81, 32, 14, 17 } };
        for (int r = 0; r < sales.length; r++) {
            for (int c = 0; c < sales[r].length; c++) {
                System.out.print(sales[r][c] + " ");
            }
            System.out.println();
        }
    }
}
