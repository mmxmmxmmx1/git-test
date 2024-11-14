//Ex15_10 , 建立hi與bye 
package Exam.Ex15.Ex15_10;

// Hello 類別實現 Runnable 介面，用來表示要執行的任務
class Hello implements Runnable {
    private int deeptime; // 休眠時間（毫秒）
    private String name; // 執行緒名稱

    // 構造方法，用於初始化執行緒名稱和休眠時間
    public Hello(String na, int d) {
        name = na;
        deeptime = d;
    }

    // run 方法是執行緒的入口點，當執行緒啟動時會執行這個方法
    public void run() {
        // 循環打印執行緒名稱和計數器，總共打印5次
        for (int i = 1; i <= 5; i++) {
            try {
                // 執行緒休眠指定的時間
                Thread.sleep(deeptime);
                // 打印執行緒名稱和計數器
                System.out.println(name + " " + i);
            } catch (InterruptedException e) {
                // 捕捉並忽略 InterruptedException
            }
        }
    }
}

// Ex15_10 類別包含主方法，用於啟動應用程序
public class Ex15_10 {
    public static void main(String[] args) {
        // 創建兩個 Hello 物件，每個物件分別設定不同的休眠時間
        Hello hi = new Hello("Hello", 1000); // 每 1 秒打印一次
        Hello bye = new Hello("Good bye", 2500); // 每 2.5 秒打印一次

        // 創建兩個執行緒，並將 Hello 物件作為參數傳遞給執行緒
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(bye);

        // 啟動兩個執行緒，開始並行打印訊息
        t1.start();
        t2.start();
    }
}
