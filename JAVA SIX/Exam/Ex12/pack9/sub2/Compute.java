package Exam.Ex12.pack9.sub2;

import Exam.Ex12.pack9.sub1.MyMath;

public class Compute extends MyMath {
    private int ans;

    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    }

    public int div(int a, int b) {
        ans = a / b;
        return ans;
    }

    public void show() {
        System.out.println("ans= " + ans);
    }
}
