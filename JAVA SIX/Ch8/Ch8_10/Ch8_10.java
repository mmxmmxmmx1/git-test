//Ch8_10，函數的多載(一)
package Ch8_10;

class Circle {
    String color;
    double pi = 3.14;
    double radius;

    void setCircle(String str) {
        color = str;
    }

    void setRadius(double r) {
        radius = r;
    }

    void setAll(String str, double r) {  //設定color與radius
        color = str;
        radius = r;
    }

    void show() {                      //列印半徑.顏色與圓面積
        System.out.printf("color=%s, Radius=%5.2f\n", color, radius);
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Ch8_10 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setCircle("red");
        c1.setRadius(2.0);
        c1.show();

        c1.setAll("Blue", 4.0);        //設定color與radius
        c1.show();
    }
}
