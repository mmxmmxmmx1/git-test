//Ex13_5 修改程式碼加入try-catch-finally 區塊 ,若除數為0 ,則跳過除法的運算,並印出"除數為0不計算'的字串,若為0則繼續除法運算
package Exam.Ex13.Ex13_5;

public class Ex13_5 {
    public static void main(String[] args) {
        int num = 5;
        int[] d = { 3, 0, 0, 1 };
        try {
            for (int i = 0; i < d.length; i++) {
                if (d[i] == 0) {
                    System.out.println("除數為0不計算");
                } else {
                    System.out.println(num + "/" + d[i] + "=" + num / d[i]);
                }
            }
        }
         catch (ArithmeticException e) {
        }
    }
}
