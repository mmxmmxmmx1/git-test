//第10章 習題Ex10_5,三角形Triangle
package Exam.Ex10.Ex10_5;

// 定義一個名為 Triangle 的父類別
class Triangle {
    // 定義 base 和 height 為受保護的整數屬性
    protected int base;
    protected int height;

    // 受保護的方法 show，用來顯示 base 和 height 的值
    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

// 定義一個名為 Data 的子類別，繼承自 Triangle
class Data extends Triangle {

    // 帶參數的建構子，用來初始化 base 和 height
    public Data(int b, int h) {
        this.base = b;
        this.height = h;
    }

    // 公共方法 area，用來計算和顯示三角形的面積
    public void area() {
        // 調用父類別的 show 方法，顯示 base 和 height 的值
        super.show();
        // 計算三角形的面積並顯示，使用 printf 來格式化輸出
        System.out.printf("area=%6.2f ", (base * height / 2d));
    }
}

// 主類別 Ex10_5
public class Ex10_5 {
    // 主方法，程式執行的入口
    public static void main(String[] args) {
        // 創建 Data 類別的實例 obj，並傳入 base 和 height 的值
        Data obj = new Data(3, 8);
        // 調用 obj 的 area 方法，顯示三角形的 base、height 和面積
        obj.area();
    }
}
