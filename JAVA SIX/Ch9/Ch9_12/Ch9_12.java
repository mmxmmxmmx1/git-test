//Ch9_12,建立物件陣列
package Ch9.Ch9_12;

class Circle {
    private static double pi = Math.PI;
    private double radius;

    public Circle(double r) { // Circle 建構子
        radius = r;
    }

    public void show() {
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Ch9_12 {
    public static void main(String[] args) {
        Circle[] cir;                       //   
        cir = new Circle[3];                // 宣告Circle型別的陣列，並用new配置記憶體空間
        cir[0] = new Circle(1.0);         //
        cir[1] = new Circle(4.0);         // 用new產生新的物件，並配置給陣列元素 
        cir[2] = new Circle(2.0);         //

        cir[0].show();                      // 利用物件cir[0]呼叫show()函數
        cir[1].show();                      // 利用物件cir[1]呼叫show()函數
        cir[2].show();                      // 利用物件cir[]呼叫show()函數
    }
}
