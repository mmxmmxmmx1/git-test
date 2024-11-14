//Ex12_4 Diag與Ex12_4 分開儲存
package Exam.Ex12.package_pack12_4.Diag;

public class Diag {
    private int width;
    private int height;

    public Diag(int w, int h) {
        width = w;
        height = h;
    }

    public void show() {
        System.out.println("W=" + width + "， H=" + height);
        System.out.printf("length=%5.2f\n", dia());
    }

    public double dia() {
        return Math.sqrt(width * width + height * height);
    }
}
