//Ch8_7，呼叫函數並傳遞引數
package Ch8_7;

class Circle {
    double pi = 3.14;
    double radius;

    void show_area() {
        System.out.printf("radius=%5.2f, ", radius);
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }

    void setRadius(double r) {
        radius = r;
    }
}

public class Ch8_7 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(4.0);
        c1.show_area();
    }

}
