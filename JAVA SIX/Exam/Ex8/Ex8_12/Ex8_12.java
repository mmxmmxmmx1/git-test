//第八章 習題 8-12 設定Circle 類別來完成圓形函數
package Exam.Ex8.Ex8_12;

class Circle {
    double pi = 3.14;
    double area;

    float area(float p, float r) {
        return p * r * r;
    }

    int area(int p, int r) {
        return p * r * r;
    }

    double area(double p, double r) {
        return p * r * r;

    }
}

public class Ex8_12 {
    public static void main(String[] args) {
        Circle c1;
        c1 = new Circle();
        System.out.println(c1.area(3.14, 2));
        System.out.println(c1.area(3.14, 2.2f));
        System.out.println(c1.area(3.14, 2.2));
    }

}
