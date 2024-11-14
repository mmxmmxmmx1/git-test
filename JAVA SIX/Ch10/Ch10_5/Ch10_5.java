//Ch10_5,protected成員的使用
package Ch10.Ch10_5;

class Circle {
    protected static double pi = Math.PI;
    protected double radius;

    public void show() {
        System.out.printf("area=%6.2f", pi * radius * radius);
    }
}

class Coin extends Circle {
    private int value;

    public Coin(double r, int v) {
        radius = r;
        value = v;
        System.out.println("radius=" + radius + ", value+" + value);
    }
}

public class Ch10_5 {
    public static void main(String[] args) {
        Coin coin = new Coin(2.5, 10);
        coin.show();

    }
}
