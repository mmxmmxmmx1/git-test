//第五章 練習題22 5-22 幾隻兔子
package Exam.Ex5.Ex5_22;

public class Ex5_22 {
    public static void main(String[] args) {
        // 繼續迴圈直到找到符合所有條件的數字
        for (int n = 1; n <= 300; n++) {
            while (!(n % 3 == 1 && n % 5 == 3 && n % 7 == 2)) {
                n++;
            }
            System.out.println("符合條件的最少兔子數是: " + n);
        }
    }

}