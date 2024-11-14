//第10章 習題Ex10_16 定義Rectangle類別，用於表示長方形。
// 長方形由其長度(width)和高度(height)定義。
package Exam.Ex10.Ex10_16;

//Rectangle類別用於表示一個長方形，其長度和高度可以被設置。
class Rectangle {
    // 長方形的長度。
    protected int width;
    // 長方形的高度。
    protected int height;

    // 建構子，用於初始化長方形的長度和高度。
    protected Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    // 返回長方形的詳細信息，包括其長度、高度和面積。
    public String toString() {
        String str = "width=" + width + "， height=" + height + "， area=" + width * height;

        return str;
    }
}

public class Ex10_16 {
    public static void main(String[] args) {
        // 創建一個長方形實例，長度為20，高度為60。
        Rectangle rect = new Rectangle(20, 60);
        // 輸出長方形的詳細信息。
        System.out.println(rect.toString());
    }
}
