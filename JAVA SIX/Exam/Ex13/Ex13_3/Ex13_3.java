//第13章 習題題Ex13_3 , 例外訊息的擷取
package Exam.Ex13.Ex13_3;

public class Ex13_3 {
    public static void main(String[] args) {
        int num = 12, den = 0;
        try {
            int ans = num / den;
        } catch (ArithmeticException e) {
            System.out.println("錯誤訊息: " + e);
        }
        System.out.println("end of main()!!");
    }
}
