//Ch9_9,物件變數使用的注意事項
package Ch9.Ch9_9;

class Circle {
    private static double pi = Math.PI;
    private double radius;

    public Circle(double r) { // Circle建構子
        radius = r;
    }

    public void setRadius(double r) {
        radius = r; // 設定radius成員的值
    }

    public void show() {
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Ch9_9 {
    public static void main(String[] args) {
        Circle c1, c2;
        c1 = new Circle(1.0);
        c1.show();
        c2 = c1;
        c2.show();
        c2.setRadius(2.0);
        c2.show();
        c1.show();
        Circle c3 = new Circle(3.0);
        c3.show();

    }
}
