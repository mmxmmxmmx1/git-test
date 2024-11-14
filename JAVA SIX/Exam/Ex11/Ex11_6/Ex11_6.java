//第11章 習題題Ex11_6 設定iShape 介面
package Exam.Ex11.Ex11_6;

interface iShape {
    abstract public void show();

    abstract public int area();
}

class Color {
    protected String color;

    public Color(String s) {
        this.color = s;
    }
}

class Win extends Color implements iShape {
    private int width;
    private int height;

    public Win(int w, int h, String s) {
        super(s);
        this.width = w;
        this.height = h;
    }

    public void show() {
        System.out.println("Width= " + width);
        System.out.println("Height= " + height);
        System.out.println("Color= " + color);
        System.out.println("Area= " + area());

    }

    public int area() {
        return this.height * this.width;

    }
}

public class Ex11_6 {
    public static void main(String[] args) {
        Win w = new Win(5, 7, "Red");
        w.show();
    }
}
