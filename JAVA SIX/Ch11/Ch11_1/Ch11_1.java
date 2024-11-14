//Ch11_1,抽象類別的實作
package Ch11.Ch11_1;

abstract class Shape { // 定義抽象類別Shape
    protected String color; // 資料成員

    public void setColor(String str) { // 一般函數
        color = str;
    }

    public abstract void show(); // 抽象函數,只有定義名稱,沒有定義處理方式
}

class Rectangle extends Shape { // 定義子類別Rectangle
    protected int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void show() { // 名確定義繼承自抽象類別的show()
        System.out.print("color=" + color + "， ");
        System.out.println("area=" + width * height);
    }
}

class Circle extends Shape { // 定義子類別Circle
    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    public void show() { // 明確定義繼承自抽象類別的show()
        System.out.print("color=" + color + "， ");
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class Ch11_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        r1.setColor("Yellow"); // 呼叫父類別裡的 setColor()
        r1.show(); // 呼叫Rectangle類別裡的 show()
        Circle c1 = new Circle(2.0);
        c1.setColor("Green"); // 呼叫父類別裡的 setColor()
        c1.show(); // 呼叫Circle類別裡的 show()
    }

}
