//第七章 習題 7-29 計算整數與浮點的三角形面積
package Exam.Ex7.Ex7_29;

public class Ex7_29 {
    public static int triangel(int a, int b) {
        return (a * b) / 2;
    }

    public static double triangel1(double a, double b) {
        return (a * b) / 2;
    }

    public static void main(String[] args) {
        int ab;
        double cd;
        ab = triangel(6, 3);
        cd = triangel1(4.2, 3.3);
        System.out.println("int計算三角形面積:" + ab);
        System.err.println("double計算三角形面積" + cd);
    }
}
