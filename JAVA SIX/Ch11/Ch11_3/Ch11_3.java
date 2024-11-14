//Ch11_3，修改Ch11_1 並利用父類別的陣列變數來存取子類別的內容
package Ch11.Ch11_3;

// 定義抽象類別 Shape
abstract class Shape {
    // 保護欄位 color，用於存儲形狀的顏色
    protected String color;

    // 設定顏色的方法
    public void setColor(String str) {
        color = str;
    }

    // 抽象方法 show()，需要在子類別中實作
    public abstract void show();
}

// 定義子類別 Rectangle，繼承自 Shape
class Rectangle extends Shape {
    // 保護欄位 width 和 height，用於存儲矩形的寬和高
    protected int width;
    protected int height;

    // 矩形的建構子，初始化寬和高
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    // 實作抽象方法 show()
    public void show() {
        // 輸出矩形的顏色和面積
        System.out.print("Color=" + color);
        System.out.printf("， Rectangle area=%3d", width * height);
    }
}

// 定義子類別 Circle，繼承自 Shape
class Circle extends Shape {
    // 保護欄位 radius，用於存儲圓的半徑
    protected double radius;

    // 圓的建構子，初始化半徑
    protected Circle(double r) {
        radius = r;
    }

    // 實作抽象方法 show()
    public void show() {
        // 輸出圓的顏色和面積
        System.out.print("\nColor= " + color);
        System.out.printf("， Circle area=%5.2f", Math.PI * radius * radius);
    }
}

// 主類別 Ch11_3，包含主方法
public class Ch11_3 {
    // 主方法
    public static void main(String[] args) {
        // 定義一個 Shape 類型的陣列來存儲不同的子類別物件
        Shape s[];
        s = new Shape[2];

        // 創建 Rectangle 物件並存入陣列的第一個位置，設置顏色並顯示其屬性
        s[0] = new Rectangle(5, 10);
        s[0].setColor("Yellow");
        s[0].show(); // 輸出：Color=Yellow， Rectangle area= 50

        // 創建 Circle 物件並存入陣列的第二個位置，設置顏色並顯示其屬性
        s[1] = new Circle(2.0);
        s[1].setColor("Green");
        s[1].show(); // 輸出：Color= Green， Circle area=12.57
    }
}