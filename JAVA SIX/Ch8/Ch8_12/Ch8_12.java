//Ch8_12 圓形類別,錯誤的半徑數值卻會出現正確的圓面積 。raidus =-2.0卻出現12.56的正確數值
package Ch8_12;

class Circle {
    double pi = 3.14;
    double radius;

    void show_area() {
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Ch8_12 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius =-2.0;         //設定-2.0
        c1.show_area();
    }
}
