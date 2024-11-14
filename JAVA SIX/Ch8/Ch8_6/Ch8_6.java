//Ch8_6 在類別內部呼叫函數
package Ch8_6;

class Circle {
    double pi = 3.14;
    double raidus;

    void show_area() {       //show_area()函數，顯示出圓面積
        System.out.printf("area=%6.2f\n", pi * raidus * raidus);
    }

    void show_all() {       //show_all()函數，同時顯示出半徑與圓面積
        System.out.printf("radius=%5.2f\n", raidus);
        this.show_area();        //於類別內呼叫show_area()函數
    }
}

public class Ch8_6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.raidus = 2.0;
        c1.show_all();            //用c1物件呼叫show_all()
    }
}
