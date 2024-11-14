//第13章 習題題Ex13_1 , 例外訊息的擷取
//(a)程式碼會產生錯誤訊息。
//(b)因為除數為0,所以會產生ArithmeticException 的錯誤訊息
//(c)System.out.println("end of main()!!"); 不會被執行,因為在 int ans = num / den; 時程式就會算數異常跳出執行了。
package Exam.Ex13.Ex13_1;

public class Ex13_1 {
    public static void main(String[] args) {
        int num = 13, den = 0;
        int ans = num / den;
        System.out.println("end of main()!!");
    }
}
