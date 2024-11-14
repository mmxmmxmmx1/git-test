//第九章 習題 9-5 Count
package Exam.Ex9.Ex9_6;

class Count {
    private int cnt;
    private static int count = 0;

    public Count() {
        this(0);
    }

    public Count(int c) {
        cnt = c;
        count++;

    }

    void setZero() {
        cnt = 0;
    }

    public void setValue(int n) {
        cnt = n;

    }

    public void show() {
        System.out.println("" + cnt + " " + count);
    }

}

public class Ex9_6 {
    public static void main(String[] args) {
        Count cnt = new Count(30);
        cnt.show();
        Count cnt1 = new Count(80);
        cnt.setZero();
        cnt.setValue(10);
        cnt.show();
        cnt1.show();

    }
}
