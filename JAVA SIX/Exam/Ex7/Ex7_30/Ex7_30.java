//第七章 習題 7-30 傳回最大值
package Exam.Ex7.Ex7_30;

public class Ex7_30 {
    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return a;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int ab, cd;
        ab = max(8, 2);
        cd = max(1, 5, 9);
        System.out.println("a,b兩數中較大的數: " + ab);
        System.out.print("a,b,c三值中最大的值: " + cd);
    }
}
