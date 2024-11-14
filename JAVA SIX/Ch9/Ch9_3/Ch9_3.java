//Ch9_3, 建構子的多載
package Ch9.Ch9_3;

class Circle {
    private String color;
    private double pi = Math.PI;
    private double radius;

    public Circle() {
        this("Green", 1.0);
        System.out.println("Contructor Circle() called");
    }

    public Circle(String str, double r) {
        System.out.println("Constructor Circle(String,double) called");
        color = str;
        radius = r;
    }

    public void show() {
        System.out.printf("color=%s, Radius=%5.2f\n", color, radius);
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Ch9_3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.show();
    }
}
