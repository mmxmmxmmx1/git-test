//第11章 習題題Ex11_12,iVolume介面
package Exam.Ex11.Ex11_12;

// 定義一個介面iVolume，包含兩個方法：showData()和vol()
interface iVolume {
    public void showData(); // 顯示球體的資料
    public double vol();    // 計算球體積
}

// 定義一個抽象類別Sphere，實作iVolume介面
abstract class Sphere implements iVolume {
    final double PI = Math.PI; // 定義圓周率PI，使用Math.PI更精確
    protected int x; // 定義球體的x座標
    protected int y; // 定義球體的y座標
}

// 定義一個具體類別Circle，繼承抽象類別Sphere
class Circle extends Sphere {
    double radius; // 定義球體的半徑
    double area;   // 定義球體的體積

    // Circle類別的建構子，初始化x, y座標和半徑
    public Circle(int x, int y, double p) {
        this.x = x;
        this.y = y;
        this.radius = p; // 修正為radius，避免拼寫錯誤
    }

    // 實作vol()方法，計算球體的體積
    public double vol() {
        area = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        return area;
    }

    // 實作showData()方法，顯示球體的資料
    public void showData() {
        System.out.println("球心: (" + x + "," + y + ")");
        System.out.println("半徑: " + radius);
        System.out.printf("球體積:%5.2f\n", vol()); // 格式化輸出體積
    }
}

// 定義主類別Ex11_12，包含主方法main
public class Ex11_12 {
    public static void main(String[] args) {
        Circle c1 = new Circle(8, 6, 2); // 創建Circle物件
        c1.showData(); // 顯示Circle物件的資料
    }
}