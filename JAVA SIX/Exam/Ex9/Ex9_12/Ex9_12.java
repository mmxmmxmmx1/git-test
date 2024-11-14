//第九章 習題 9-12 Fraction getN,getD
package Exam.Ex9.Ex9_12;
class Fraction {
    private int num, den;

    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    public void setN(int n) {
        num = n;
    }

    public void setD(int d) {
        den = d;
    }

    public void setND(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getN() {
        return num;
    }

    public int getD() {
        return den;
    }


     void show(Fraction f) {
        int n = f.getN();
        int d = f.getD();
        System.out.println(n + "/" + d);
    }
}

public class Ex9_12 {
    public static void main(String[] args) {
        Fraction f = new Fraction(5, 3);
        f.show(f);
    }
}
