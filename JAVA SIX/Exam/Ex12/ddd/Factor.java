//Factor 類別
package Exam.Ex12.ddd;

public class Factor {
    public int fac(int n) {
        if (n >= 1) {
            return n * fac(n - 1);
        } else {
            return 1;
        }
    }
}