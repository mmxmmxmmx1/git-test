package Ch8_5;

class Circle {
    double pi = 3.14;
    double radius;

    void show_area() {
        System.out.printf("pi=%5.2f, area=%6.2f\n", pi, pi * radius * radius);
    }
}

public class Ch8_5 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = c2.radius = 2.0; //設定資料成員的值
        c2.pi = 3.0;                 //改變c2的pi
        c1.show_area();
        c2.show_area();

    }
}
