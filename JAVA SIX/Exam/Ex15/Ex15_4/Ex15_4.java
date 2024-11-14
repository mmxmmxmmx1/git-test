//Ex15_4 實作Runnable 建立執行緒
package Exam.Ex15.Ex15_4;

// 定義實作 Runnable 介面的 Add 類別
class Add implements Runnable {
    private int n; // 儲存計算上限值
    private int sum = 0; // 儲存計算總和

    // 建構子，初始化 n 的值
    public Add(int a) {
        n = a;
    }

    // 實作 Runnable 介面的 run 方法
    public void run() {
        // 計算 1 到 n 的和
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // 輸出計算結果
        System.out.println(sum);
    }
}

// 定義主類別 Ex15_4
public class Ex15_4 {
    public static void main(String[] args) {
        // 創建 Add 類別的兩個實例，分別計算 1+2+...+5 和 1+2+...+10 的值
        Add num1 = new Add(5);
        Add num2 = new Add(10);

        // 創建兩個執行緒，分別執行 num1 和 num2
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);

        // 啟動執行緒，開始計算
        t1.start();
        t2.start();
    }
}