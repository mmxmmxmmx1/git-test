//Ch7_6 傳遞二維陣列
package Ch7.Ch7_6;

public class Ch7_6 {
    public static void main(String[] args) {
        int[][] mat = { { 18, 32, 65, 27, 30 }, { 17, 56, 12, 66 } }; // 定義二維陣列
        print_mat(mat);
    }

    public static void print_mat(int[][] arr) {
        for (int[] row : arr) { // 走訪陣列的內容
            for (int e : row)
                System.out.printf("%3d", e);
            System.out.print("\n");
        }
    }
}