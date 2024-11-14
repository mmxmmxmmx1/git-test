//Ch8_4 圓面積類別Circle
package Ch8_4;

class Circle {
    double pi = 3.14;
    double radius;

    void show_area() {               //show_area()函數，顯示出圓面積
        System.out.printf("area=%6.2f", pi * radius * radius);
    }
}

public class Ch8_4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.0;              //設定radius的值
        c1.show_area();               //呼叫show_area()函數
    }
}
