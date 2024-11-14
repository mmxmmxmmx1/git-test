//第11章 習題題Ex11_3,抽象類別
package Exam.Ex11.Ex11_3;

abstract class Shape {
    protected int width;
    protected int height;

    public void show() {
        System.out.println("width= " + width);
        System.out.println("height= " + height);
        System.out.println("area= " + area());
    }

    public abstract int area();
}

class Win extends Shape {
    private int area;

    public Win(int h, int w) {
        width = w;
        height = h;
    }

    public int area() {
        area = height * width;
        return area;

    }
}

public class Ex11_3 {
    public static void main(String[] args) {
        Win w = new Win(5, 7);
        w.show();
    }
}
