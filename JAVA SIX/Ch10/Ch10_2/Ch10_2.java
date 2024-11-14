//Ch10_2,呼叫父類別中特定的建構子
package Ch10.Ch10_2;

class Circle {
    private static double pi = Math.PI;
    private double radius;

    public Circle() {
        System.out.println("Circle() constructor called");
    }

    public Circle(double r) {
        System.out.println("Circle(double r) contructor called");
        radius = r;
    }

    public void show() {
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

class Coin extends Circle {
    private int value;

    public Coin() {
        System.out.println("Coin() contructor called");
    }

    public Coin(double r, int v) {
        super(r);
        value = v;
        System.out.println("Coin(double r, int v) constructor called");
    }
}

public class Ch10_2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin(2.5, 10);
        coin1.show();
        coin2.show();
    }

}
