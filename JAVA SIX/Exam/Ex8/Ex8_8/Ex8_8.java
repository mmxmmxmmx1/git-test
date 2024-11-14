//第八章 習題 8-8 CCalculator類別
package Exam.Ex8.Ex8_8;

class CCalculator {
    int a;
    int b;

    void set_value(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println("a值:" + a + "， b值:" + b);
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    double avg() {
        return (a + b) / 2d;
    }
}

public class Ex8_8 {
    public static void main(String[] args) {
        CCalculator obj;
        obj = new CCalculator();
        obj.set_value(5, 12);
        obj.show();
        System.out.println("a與b的合=" + obj.add());
        System.out.println("a減b=" + obj.sub());
        System.out.println("a乘上b=" + obj.mul());
        System.out.printf("a與b的平均值=%5.2f", obj.avg());
    }

}
