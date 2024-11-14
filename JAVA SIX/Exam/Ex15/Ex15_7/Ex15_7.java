//Ex15_7 , 實作Runnable 介面 t1間隔1秒印出Thread 1 is running ,t2 間隔2.5秒印出Thread 2 is running ,執行10次
package Exam.Ex15.Ex15_7;

// Trun 類別實現 Runnable 接口，分別用於間隔特定時間打印訊息
class Trun implements Runnable {
    private String number; // 執行緒編號
    private int sleeptime; // 執行緒休眠時間（毫秒）

    // 構造方法，用於初始化執行緒編號和休眠時間
    public Trun(String num, int d) {
        number = num;
        sleeptime = d;
    }

    // run 方法是執行緒的入口點，當執行緒啟動時會執行這個方法
    public void run() {
        try {
            // 循環執行 10 次
            for (int i = 0; i < 10; i++) {
                // 執行緒休眠指定的時間
                Thread.sleep(sleeptime);
                // 打印執行緒編號和運行訊息
                System.out.println("Thread " + number + " is running");
            }
        } catch (InterruptedException e) {
            // 捕捉並處理 InterruptedException
            e.printStackTrace();
        }
    }
}

// Ex15_7 類別包含主方法，用於啟動應用程序
public class Ex15_7 {
    public static void main(String[] args) {
        // 創建兩個 Trun 物件，每個物件分別設定不同的休眠時間
        Trun t = new Trun("1", 1000); // 每 1 秒打印一次
        Trun tt = new Trun("2", 2500); // 每 2.5 秒打印一次

        // 創建兩個執行緒，並將 Trun 物件作為參數傳遞給執行緒
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(tt);

        // 啟動兩個執行緒，開始並行打印訊息
        t1.start();
        t2.start();
    }
}
