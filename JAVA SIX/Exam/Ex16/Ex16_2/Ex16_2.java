//Ex16_2 認識集合物件
package Exam.Ex16.Ex16_2;

class ShowArea<T> {
    // 私有成員變數 radius，用於存儲半徑的值，類型為 T
    private T radius;

    public void setValue(T value) {
        radius = value; // 將傳入的值賦給 radius
    }

    public void show() {
        double r = (double) radius;
        double area = r * r * 3.14;
        // 將 radius 轉換為 double，計算面積並輸出
        System.out.println("area=" + area);
    }
}

class ShowColor<T> {
    // 私有成員變數 color，用於存儲顏色的值，類型為 T
    private T color;

    public void setValue(T value) {
        color = value; // 將傳入的值賦給 color
    }

    public void show() {
        // 將 color 轉換為 String，顯示顏色
        System.out.println("color=" + (String) color);
    }
}

/**
 * 主類別 Ex16_2，包含程式的入口點 main 方法
 */
public class Ex16_2 {
    public static void main(String[] args) {
        // 創建一個 ShowArea 類別的實例 s1，指定泛型類型為 Double
        ShowArea<Double> s1 = new ShowArea<>();

        // 創建另一個 ShowColor 類別的實例 s2，指定泛型類型為 String
        ShowColor<String> s2 = new ShowColor<>();

        // 使用 s1 設置半徑的值為 2.0（Double 類型）
        s1.setValue(2.0);

        // 使用 s2 設置顏色的值為 "Blue"（String 類型）
        s2.setValue("Blue");

        // 呼叫 s1 的 show 方法，計算並顯示圓的面積
        s1.show();

        // 呼叫 s2 的 show 方法，顯示圓的顏色
        s2.show();
    }
}
