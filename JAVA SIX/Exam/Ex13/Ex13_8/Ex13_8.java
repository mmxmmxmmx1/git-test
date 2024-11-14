//Ex13_8 利用try-catch 區塊捕捉錯誤而產生的例外，其中catch區塊可同時捕捉除數為0跟陣列索引值超出範圍。
//
package Exam.Ex13.Ex13_8;

public class Ex13_8 {
    public static void main(String[] args) {
        int[] a = { 64, 15, 47, 23, 96, 38 };
        int[] d = { 3, 0, 7, 9, 14, 0 };
        int sum = 0;
        for (int i = 0; i <= 6; i++) {
            try {
                sum += a[i] / d[i];
            } catch (ArithmeticException e) {
                System.out.println("除數為0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("陣列索引值超出範圍");
            }
        }
        System.out.println("sum=" + sum);
    }
}
