//第11章 習題題Ex11_1，抽象類別裡的建構子
package Exam.Ex11.Ex11_1;

abstract class Caaa {
    protected int num;

    public Caaa(int n) {
        num = n;
    }

    public abstract void show();
}

class Cbbb extends Caaa {

    public Cbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num= " + num);

    }

}

public class Ex11_1 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2);
        bb.show();
    }

}