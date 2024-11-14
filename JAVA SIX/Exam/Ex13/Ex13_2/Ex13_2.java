//第13章 習題題Ex13_2 , 例外訊息的擷取
//使用if-else判斷den為0跳出錯誤訊息,不為0進行除法運算
package Exam.Ex13.Ex13_2;

public class Ex13_2 {
    public static void main(String[] args) {
        int num = 12, den = 0;
        if (den == 0) {
            System.out.println("除數為0");
            return;
        }
        int ans = num / den;
        System.out.println("end of main()!!");
    }
}
