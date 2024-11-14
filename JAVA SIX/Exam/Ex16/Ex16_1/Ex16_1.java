//Ex16_1 認識集合物件

// 定義程式所在的套件（Package）
package Exam.Ex16.Ex16_1;

// 定義一個泛型類別 Ball，使用類型參數 T
class Ball<T> {
    // 私有成員變數 id，其類型為 T
    private T id;

    public void setValue(T value) {
        id = value; // 將傳入的值賦給 id
    }

    /**
     * 顯示 id 的值
     */
    public void show() {
        System.out.println(id); // 輸出 id 的值到控制台
    }
}

// 定義公共類別 Ex16_1，作為程式的入口點
public class Ex16_1 {
    public static void main(String[] args) {
        // 創建一個 Ball 類別的實例 b1，指定泛型類型為 String
        Ball<String> b1 = new Ball<>();

        // 創建另一個 Ball 類別的實例 b2，指定泛型類型為 Integer
        Ball<Integer> b2 = new Ball<>();

        // 使用 b1 設置 id 的值為 "Red"（字串類型）
        b1.setValue("Red");

        // 使用 b2 設置 id 的值為 255（整數類型）
        b2.setValue(255);

        // 呼叫 b1 的 show 方法，顯示 id 的值（"Red"）
        b1.show();

        // 呼叫 b2 的 show 方法，顯示 id 的值（255）
        b2.show();
    }
}
