//第10章 習題Ex10_17 設定Truck類別，並用getClass()列印出來
package Exam.Ex10.Ex10_17;

// Truck類別包含一個受保護的字串成員變數name
class Truck {
    protected String name = "Toyota"; // 初始化name為"Toyota"
}

// 主類別Ex10_17，包含main方法
public class Ex10_17 {
    public static void main(String[] args) {
        // 創建Truck類的實例t1
        Truck t1 = new Truck();

        // 使用getClass()方法取得t1的類別並列印出來
        System.out.println(t1.getClass());
    }
}
