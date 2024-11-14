//第10章 習題Ex10_11 Caaa 父類別的定義
package Exam.Ex10.Ex10_11;

class Caaa {
    public int n1, n2;

    public Caaa() {
        n1 = n2 = 1;
    }

    public Caaa(int a, int b) {
        n1 = a;
        n2 = b;
    }
}

class Cbbb extends Caaa {

    public Cbbb() {
        super();
    }

    public Cbbb(int a, int b) {
        super(a, b);
    }
}

public class Ex10_11 {
    public static void main(String[] args) {
        Cbbb b1 = new Cbbb();
        Cbbb b2 = new Cbbb(3, 5);
        System.out.println("b1 n1=" + b1.n1 + "， b1 n2=" + b1.n2);
        System.out.println("b2 n1=" + b2.n1 + "， b2 n2=" + b2.n2);

    }
}
