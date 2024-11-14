//練習題3-20.21
package Exam.Ex3.Ex3_20;

public class Ex3_20 {
    public static void main(String[] args) {
        int a = 127;
        System.out.printf("a=%+06d\n", a); // 練習題3-20(a)
        System.out.printf("a=%-6d,\n", a); // 練習題3-20(b)
        System.out.printf("a=%6d,\n", a); // 練習題3-20(c)
        System.out.printf("a=%d\n", a); // 練習題3-20(d)

        float b = 12.3456f;
        System.out.printf("b=%+08.2f\n", b); // 練習題3-21(a)
        System.out.printf("b=%+f\n", b); // 練習題3-21(b)
        System.out.printf("b=%08.3f\n", b); // 練習題3-21(c)
        System.out.printf("b=%.0f\n", b); // 練習題3-21(d)
        System.out.printf("b=  %.2f\n", b); // 練習題3-21(e)
        System.out.printf("b=%08.3f\n", b); // 練習題3-21(f)

    }
}
