//Ex13_6 , 程式內加入try-catch 將除數0與陣列索引值超出範圍排除
package Exam.Ex13.Ex13_6;

public class Ex13_6 {
    public static void main(String[] args) {
        int num = 12;
        int[] den = { 12, 0, 3, 0, 0, 4 };
        try {
            for (int i = 0; i < 10; i++) {
                if (den[i] == 0) {
                    System.out.println("除數為0");
                } else {
                    System.out.println(num + "/" + den[i] + "=" + num / den[i]);
                }
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列引鎖超出範圍");
        }
    }
}
