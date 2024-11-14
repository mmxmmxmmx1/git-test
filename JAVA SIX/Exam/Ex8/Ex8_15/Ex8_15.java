package Exam.Ex8.Ex8_15;

class CSphere {
    private int x;
    private int y;
    private int z;
    private int r;
    public double pi = 3.14;

    void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int setRadius(int radius) {
        r = radius;
        return r;
    }

    double surfaceArea(double r) {
        return 4 * pi * r * r;
    }

    double volume(double r) {
        return 4 / 3d * pi * r * r * r;
    }

    void showCenter() {
        System.out.println("" + x + "，" + y + "，" + z);
    }
}

public class Ex8_15 {
    public static void main(String[] args) {
        CSphere obj;
        obj = new CSphere();
        obj.setLocation(3, 4, 5);
        obj.showCenter();
        System.out.println(obj.surfaceArea(1));
        System.out.println(obj.volume(1));
    }
}
