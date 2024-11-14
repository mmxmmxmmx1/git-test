//第10章 習題Ex10_3,Retangle表示長方形
package Exam.Ex10.Ex10_3;

class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 2;
        this.width = 2;
    }

    public Rectangle(int len, int wid) {
        this.length = len;
        this.width = wid;
    }

    private void show() {
        System.out.print("length=" + length);
        System.out.print(", width=" + width);
    }

    public void area() {
        show();
        System.out.println(", area=" + length * width);
    }
}

class Data extends Rectangle {

    public Data() {

    }

    public Data(int len, int wid) {
        super(len, wid);

    }
}

public class Ex10_3 {
    public static void main(String[] args) {
        Data obj1 = new Data(3, 8);
        Data obj2 = new Data();
        obj1.area();
        obj2.area();

    }
}
