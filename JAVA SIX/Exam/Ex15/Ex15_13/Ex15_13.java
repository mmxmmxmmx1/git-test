//Ex15_13 ,sum=30,並且三個執行緒去扣除sum的值
//題目並沒有說明是30被依序扣除還是每個執行緒都有30的額度去扣除
//依照常理的判斷用總額只有30的值去扣除，直到被扣到會成為負數前停止扣除
package Exam.Ex15.Ex15_13;

import java.util.concurrent.locks.ReentrantLock;

// CData 類別繼承 Thread 類別，表示這是一個執行緒
class CData extends Thread {
    // sum 為所有 CData 執行緒共用的靜態變數，初始值為 30
    private static int sum = 30;
    // 建立一個 ReentrantLock 物件，使用公平鎖機制
    private static ReentrantLock lock = new ReentrantLock(true);
    // 每個 CData 執行緒都有自己的 n 和 sec 變數
    private int n;
    private int sec;

    // 建構子，接收 a 和 s 並初始化 n 和 sec
    public CData(int a, int s) {
        n = a;
        sec = s;
    }

    // 覆寫 Thread 類別的 run 方法，執行緒啟動時會執行此方法
    public void run() {
        // 當 sum 大於 10 時，執行以下操作
        while (sum > 10) {
            // 獲取鎖
            lock.lock();
            try {
                // 執行 sub 方法，減少 sum 的值
                sub(n, sec);
            } finally {
                // 確保在最後解鎖，即使發生例外
                lock.unlock();
            }
        }
    }

    // sub 方法用來減少 sum 的值
    public void sub(int a, int s) {
        // 計算減去 a 後的暫時變數 tmp
        int tmp = sum - a;
        try {
            // 暫停執行緒 s 毫秒
            sleep(s);
        } catch (InterruptedException e) {
        }
        // 如果減去 a 後的值仍大於 0，更新 sum 並輸出結果
        if (tmp > 0) {
            sum = tmp;
            System.out.println("減" + a + "後 ， 餘數為" + sum);
        }
    }
}

// Ex15_13 類別，包含 main 方法，為程式的入口點
public class Ex15_13 {
    public static void main(String[] args) {
        // 建立三個 CData 執行緒物件
        CData d1 = new CData(5, 1500);
        CData d2 = new CData(9, 1000);
        CData d3 = new CData(8, 2000);
        // 啟動三個執行緒
        d1.start();
        d2.start();
        d3.start();
    }
}
