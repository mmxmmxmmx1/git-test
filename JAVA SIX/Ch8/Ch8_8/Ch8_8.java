//Ch8_8，圓形類別Circle
package Ch8_8;

class Circle {
    double pi;
    double raidus;

    void show_area() { // 顯示圓面積
        System.out.printf("area=%6.2f", pi * raidus * raidus);
    }

    void setCircle(double p, double r) { // 擁有兩個引數的函數
        pi = p;
        raidus = r;
    }
}

public class Ch8_8 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setCircle(3.1416, 2.0); // 呼叫並傳遞引數到setCircle()
        c1.show_area();
    }
}
