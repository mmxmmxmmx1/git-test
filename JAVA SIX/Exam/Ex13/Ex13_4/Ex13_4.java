//Ex13_4 加入try-catch-finally 區塊 ,陣列超過長度即停止運算
package Exam.Ex13.Ex13_4;

public class Ex13_4 {
    public static void main(String[] args) {
        int[] arr = { 18, 29, 13, 38, 15, 62 };
        try {
            int den = 5;

            for (int i = 0; i < 10; i++) {
                System.out.print(arr[i] + "/" + den + "=");
                arr[i] /= den;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("超過陣列長度");
            return;
        }
        System.out.println("end of main()method !!");
    }
}
