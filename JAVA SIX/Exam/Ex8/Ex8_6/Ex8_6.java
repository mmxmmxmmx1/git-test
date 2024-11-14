//第八章 習題 8-6 圓形類別Circle
package Exam.Ex8.Ex8_6;

class Circle {
    double pi = 3.14;
    double radius;

    void show_periphery() {
        System.out.println("periphery=" + 2 * pi * radius);
    }
}

public class Ex8_6 {
    public static void main(String[] args) {
        Circle c1;
        c1 = new Circle();
        c1.radius = 3.0;
        c1.show_periphery();
    }
}
