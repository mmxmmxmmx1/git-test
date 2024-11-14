package Exam.Ex6.Ex6_2;

public class Ex6_2 {
    public static void main(String[] args) {
        int[] a = { 18, -51, 23, 35 };
        int[] b = { 28, 32, -35, 40 };
        int[] c = new int[4];
        for (int i = 0; i < a.length; i++) {
            c[i] = Math.max(a[i], b[i]);
            System.out.print(c[i] + " ");
        }
    }
}