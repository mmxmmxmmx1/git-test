// 第11章 習題題Ex11_9, 多重繼承的練習
package Exam.Ex11.Ex11_9;

// 定義介面 iShape，包含兩個方法：show 和 area
interface iShape {
    public void show(); // 顯示形狀資訊

    public int area(); // 計算並返回形狀的面積
}

// 定義介面 iColor，包含一個方法：showColor
interface iColor {
    public void showColor(); // 顯示顏色
}

// 定義類別 Win，實作 iShape 和 iColor 介面
class Win implements iShape, iColor {
    // 定義類別的成員變數 width, height 和 color
    protected int width, height; // 寬度和高度
    protected String color; // 顏色

    // 類別 Win 的建構子，初始化成員變數
    public Win(int w, int h, String s) {
        width = w; // 初始化寬度
        height = h; // 初始化高度
        color = s; // 初始化顏色
    }

    // 實作 iColor 介面的方法 showColor，顯示顏色
    public void showColor() {
        System.out.println("Color: " + color); // 顯示顏色
    }

    // 實作 iShape 介面的方法 area，計算並返回面積
    public int area() {
        return height * width; // 計算面積 (寬度 * 高度)
    }

    // 實作 iShape 介面的方法 show，顯示顏色、寬度、高度和面積資訊
    public void show() {
        showColor(); // 顯示顏色
        System.out.println("Width: " + width); // 顯示寬度
        System.out.println("Height: " + height); // 顯示高度
        System.out.println("Area: " + area()); // 顯示面積
    }
}

// 主程式類別 Ex11_9
public class Ex11_9 {
    // 主方法
    public static void main(String[] args) {
        // 建立 Win 類別的物件，並初始化寬度、高度和顏色
        Win w = new Win(5, 7, "Green"); // 建立 Win 物件，寬度為 5，高度為 7，顏色為綠色
        // 呼叫 show 方法，顯示物件的顏色和面積資訊
        w.show(); // 顯示 Win 物件的資訊
    }
}
