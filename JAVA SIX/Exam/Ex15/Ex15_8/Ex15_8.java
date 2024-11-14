//Ex15_8 , t1每間隔1秒印出5次Thread 1 is runnning ,t2每間隔2.5秒印出10個Thread 2 is running,t3等t1執行完
//後每3.5秒印出Thread 3 is running
package Exam.Ex15.Ex15_8;

// Runnable 實現類別 Trun
class Trun implements Runnable {
    private String number;
    private int sleeptime;
    private int loop;

    // 構造方法，初始化執行緒編號、休眠時間和迴圈次數
    public Trun(String num, int sleeptime, int loop) {
        this.number = num;
        this.sleeptime = sleeptime;
        this.loop = loop;
    }

    // run 方法，執行緒的入口
    public void run() {
        try {
            for (int i = 0; i < loop; i++) {
                Thread.sleep(sleeptime);
                System.out.println("Thread " + number + " is running");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

public class Ex15_8 {
    public static void main(String[] args) {
        // 創建 t1 執行緒
        Trun t1Task = new Trun("1", 1000, 5);
        Thread t1 = new Thread(t1Task);

        // 創建 t2 執行緒
        Trun t2Task = new Trun("2", 2500, 10);
        Thread t2 = new Thread(t2Task);

        // 創建 t3 執行緒
        Trun t3Task = new Trun("3", 3500, 5);
        Thread t3 = new Thread(t3Task);

        // 啟動 t1 和 t2 執行緒
        t1.start();
        t2.start();

        try {
            // 等待 t1 完成
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 啟動 t3 執行緒
        t3.start();
    }
}
