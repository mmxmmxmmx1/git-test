//Ex15_6 設計Sub類別計算1*2*3....*n
package Exam.Ex15.Ex15_6;

// Sub 類別實現 Runnable 接口，用於計算從 1 到 n 的階乘
class Sub implements Runnable {
    private int n; // 要計算階乘的數字
    private int sum = 1; // 儲存階乘結果，初始值為 1

    // 構造方法，用於初始化 n 的值
    public Sub(int a) {
        n = a;
    }

    // run 方法是執行緒的入口點，當執行緒啟動時會執行這個方法
    public void run() {
        // 循環計算 1 到 n 的階乘
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        // 打印階乘結果
        System.out.println(sum);
    }
}

// Ex15_6 類別包含主方法，用於啟動應用程序
public class Ex15_6 {
    public static void main(String[] args) {
        // 創建兩個 Sub 物件，每個物件計算不同數字的階乘
        Sub s1 = new Sub(5); // 計算 5 的階乘
        Sub s2 = new Sub(10); // 計算 10 的階乘

        // 創建兩個執行緒，並將 Sub 物件作為參數傳遞給執行緒
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        // 啟動兩個執行緒，開始並行計算階乘
        t1.start();
        t2.start();
    }
}
