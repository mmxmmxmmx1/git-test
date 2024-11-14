//第三章練習題3-22
package Exam.Ex3.Ex3_22;

public class Ex3_22 {
    public static void main(String[] args) {
        double p = 12.34;
        System.out.printf("p=%+08.2f%%\n", p);// 練習題3-22(a)
        System.out.printf("p=%9.2f%%\n", p); // 練習題3-22(b)
        System.out.printf("p=%.2f%%\n", p); // 練習題3-22(c)
        System.out.printf("\"p=%.2f%%\"\n", p); // 練習題3-22(d)
        System.out.printf("p=%3.0f%%\n", p); // 練習題3-22(e)
        System.out.printf("p=+%.2f%%", p); // 練習題3-22(f)

    }
}
