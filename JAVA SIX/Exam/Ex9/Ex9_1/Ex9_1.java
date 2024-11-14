////第九章 習題 9-1 建構子
package Exam.Ex9.Ex9_1;
class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public void show() {
        System.out.println("" + width + " " + height);
    }
}

public class Ex9_1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.show();
    }
}
