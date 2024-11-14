//第五章 練習題 25(a).(b)(c) 5-25(a).(b)(c)
package Exam.Ex5.Ex5_25;

public class Ex5_25 {
    public static void main(String[] args) {
        int line = 5; // 解25(b)改成int line =1;
        for (int a = 1; a <= line; a++) { // 解25(b) int a=5;a>=line;a--
            for (int b = 1; b <= a; b++) { // 解25(b) int b=5;b>=a;b--
                System.out.print(b); // 把b改成a就可以解(c)題
            }
            System.out.println();
        }
    }
}