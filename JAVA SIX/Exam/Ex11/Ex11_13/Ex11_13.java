//第11章 習題題將Ex11_12題目的Circle類別裡的showData()與vol() 移到抽象類別Sphere裡，並稍做修改
//，使程式可以執行 
package Exam.Ex11.Ex11_13;

// 定義一個介面iVolume，包含兩個方法：showData()和vol()
interface iVolume {
    public void showData(); // 顯示球體的資料
    public double vol();    // 計算球體積
}

// 定義一個抽象類別Sphere，實作iVolume介面
abstract class Sphere implements iVolume {
    final double PI = 3.14; // 定義圓周率PI
    protected int x; // 定義球體的x座標
    protected int y; // 定義球體的y座標
    protected int radius; // 定義球體的半徑

    // Sphere類別的建構子，初始化x, y座標和半徑
    public Sphere(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // 實作showData()方法，顯示球體的資料
    public void showData() {
        System.out.println("球心: (" + x + "," + y + ")");
        System.out.println("半徑: " + radius);
        System.out.printf("球體積:%5.2f\n", vol()); // 格式化輸出體積
    }

    // 實作vol()方法，計算球體的體積
    public double vol() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }
}

// 定義一個具體類別Circle，繼承抽象類別Sphere
class Circle extends Sphere {
    // Circle類別的建構子，呼叫父類別的建構子
    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }
}

// 定義主類別Ex11_13，包含主方法main
public class Ex11_13 {
    public static void main(String[] args) {
        Circle c1 = new Circle(8, 6, 2); // 創建Circle物件
        c1.showData(); // 顯示Circle物件的資料
    }
}
