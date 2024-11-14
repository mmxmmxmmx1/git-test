//第10章 習題Ex10_14 設一個car類別，用來表示車子資訊，並輸入資料成員即函數成員。
package Exam.Ex10.Ex10_14;

// 定義一個 Car 類別，用來表示車子資訊
class Car {
    // 定義成員變數 owner，並初始化為 "Tom"
    String owner = "Tom";
    // 定義 final 成員變數 color，並初始化為 "Red"
    final String color = "Red";

    // 定義 final 方法 show()，用來顯示車子的顏色和擁有者
    final void show() {
        System.out.println("Color:" + color + " Owner:" + owner);
    }
}

// 定義 Truck 類別，繼承自 Car 類別
class Truck extends Car {

    // 定義 Truck 的建構函數，調用父類別 Car 的建構函數
    public Truck() {
        super();
    }

    // 定義 display 方法，用來調用父類別的 show() 方法
    public void display() {
        super.show();
    }
}

// 定義主類別 Ex10_14
public class Ex10_14 {
    // 主方法，程式執行的入口點
    public static void main(String[] args) {
        // 創建一個 Truck 類別的實例 t
        Truck t = new Truck();
        // 調用 Truck 類別的 display() 方法，這將調用父類別 Car 的 show() 方法
        t.display();
    }
}