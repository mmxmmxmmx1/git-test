//第10章 習題Ex10_1 Caaa跟Cbbb
package Exam.Ex10.Ex10_1;

class Caaa {
    public int n1;
    public int n2;

    public Caaa() {
        n1 = 1;
        n2 = 1;
    }

    public Caaa(int a, int b) {
        n1 = a;
        n2 = b;

    }
}

class Cbbb extends Caaa {

    public Cbbb() {

    }

    public Cbbb(int a, int b) {
        super.n1 = a;
        super.n2 = b;

    }

    public int set_num(int n1, int n2) {
        super.n1 = n1;
        super.n2 = n2;

        return n1 + n2;
    }

    public void show() {
        System.out.println("n1=" + n1 + ", n2=" + n2);
    }
}

public class Ex10_1 {
    public static void main(String[] args) {
        Cbbb b1 = new Cbbb();
        Cbbb b2 = new Cbbb(3, 9);
        b1.show();
        b2.show();
        Cbbb bb = new Cbbb();
        bb.set_num(3, 5);
        bb.show();

    }
}
