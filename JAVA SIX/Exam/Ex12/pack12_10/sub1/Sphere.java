//Ex12_10 Sphere 類別
package Exam.Ex12.pack12_10.sub1;

public class Sphere {
    private double radius;

    public Sphere(double r) {
        radius = r;
    }

    public void show() {
        System.out.println("radius=" + radius);
        System.out.printf("volume＝%.2f", (4.0 / 3.0) * Math.PI * radius * radius * radius);
    }
}