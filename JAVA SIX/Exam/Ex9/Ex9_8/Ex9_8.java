//第九章 習題 9-8 Math資料成員pow
package Exam.Ex9.Ex9_8;

class MyMath {
    static int num;
    static int pow;

    public void mypower(int x, int n) {
        num = x;
        pow = n;
        int mypower = (int) Math.pow(x, n);
        System.out.println(x + " 的 " + n + " 次方 = " + mypower);

    }
}

public class Ex9_8 {
    public static void main(String[] args) {
        MyMath p1 = new MyMath();
        MyMath p2 = new MyMath();
        p1.mypower(2, 5);
        p2.mypower(3, 4);

    }

}
