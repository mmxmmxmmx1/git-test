//Ex12_10 Trapezoid 類別
package Exam.Ex12.pack12_10.sub2;

public class Trapezoid {
    private int upper;
    private int base;
    private int height;

    public Trapezoid(int u, int b, int h) {
        upper = u;
        base = b;
        height = h;
    }

    public void show() {
        System.out.println("\nUpper=" + upper + ", base=" + base + ", height=" + height);
        System.out.println("梯形的面積=" + (upper + base) * height / 2.0);
    }

}
