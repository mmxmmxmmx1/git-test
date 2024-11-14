//第10章 習題Ex10_9 定義Shape父類別下的各種子類別。
package Exam.Ex10.Ex10_9;

// 定義Shape父類別
class Shape {
    // 定義一個返回形狀面積的方法，這裡返回0.0，子類別將覆寫此方法
    public double area() {
        return 0.0;
    }
}

// 定義Circle類別，繼承自Shape
class Circle extends Shape {
    // 定義圓的半徑
    protected double radius;

    // Circle類別的建構函式，初始化圓的半徑
    public Circle(double r) {
        radius = r;
    }

    // 覆寫Shape類別的area方法，計算圓的面積
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 定義Square類別，繼承自Shape
class Square extends Shape {
    // 定義正方形的邊長
    protected double side;

    // Square類別的建構函式，初始化正方形的邊長
    public Square(double s) {
        side = s;
    }

    // 覆寫Shape類別的area方法，計算正方形的面積
    @Override
    public double area() {
        return side * side;
    }
}

// 定義Triangle類別，繼承自Shape
class Triangle extends Shape {
    // 定義三角形的底邊長和高度
    protected double base;
    protected double height;

    // Triangle類別的建構函式，初始化三角形的底邊長和高度
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    // 覆寫Shape類別的area方法，計算三角形的面積
    @Override
    public double area() {
        return base * height / 2;
    }
}

// 主程式類別，用於測試Shape及其子類別
public class Ex10_9 {
    public static void main(String[] args) {
        // 創建各種形狀的實例
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(9.3);
        Square s1 = new Square(5.5);
        Square s2 = new Square(7);
        Triangle t1 = new Triangle(5, 3);
        Triangle t2 = new Triangle(10, 4.5);

        // 輸出每個形狀的面積
        System.out.printf("Circle c1=%5.2f", c1.area());
        System.out.printf("\nCircle c2=%5.2f", c2.area());
        System.out.printf("\nSquare s1=%5.2f", s1.area());
        System.out.printf("\nSquare s2=%5.2f", s2.area());
        System.out.printf("\nTriangle t1=%5.2f", t1.area());
        System.out.printf("\nTriangle t2=%5.2f", t2.area());

        // 創建一個包含兩個三角形面積的數組
        double a[] = new double[2];
        a[0] = t1.area();
        a[1] = t2.area();

        // 輸出三角形中最大面積的值
        System.out.println("\n三角形最大面積的值是:" + largest(a));
    }

    // 靜態方法，找出數組中的最大值
    public static double largest(double a[]) {
        double tmax = 0;
        // 遍歷數組找出最大值
        for (int i = 0; i < a.length; i++) {
            if (tmax < a[i]) {
                tmax = a[i];
            }
        }
        return tmax;
    }
}
