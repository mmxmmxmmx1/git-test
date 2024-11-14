//Ex15_11 , animal 類別設定
package Exam.Ex15.Ex15_11;

// 定義一個名為 Animal 的類別並實現 Runnable 介面
class Animal implements Runnable {
    private String id;

    // 建構子，接收一個字串參數並設置為 id
    public Animal(String str) {
        id = str;
    }

    // 實作 run 方法，定義執行緒的行為
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(id + "來了" + i + "次");
        }
    }
}

public class Ex15_11 {
    public static void main(String[] args) {
        // 創建四個 Animal 物件，分別代表不同的動物
        Animal Tom = new Animal("狸克");
        Animal Redd = new Animal("狐利");
        Animal Tortimer = new Animal("壽伯");
        Animal Blaters = new Animal("傅達");

        // 創建四個執行緒，並將各自的 Animal 物件作為目標
        Thread t1 = new Thread(Tom);
        Thread t2 = new Thread(Redd);
        Thread t3 = new Thread(Tortimer);
        Thread t4 = new Thread(Blaters);

        // 啟動執行緒 t1
        t1.start();
        try {
            // 等待 t1 執行完成
            t1.join();

            // 啟動執行緒 t3 並等待其執行完成
            t3.start();
            t3.join();

            // 啟動執行緒 t4 並等待其執行完成
            t4.start();
            t4.join();

            // 啟動執行緒 t2 並等待其執行完成
            t2.start();
            t2.join();

            // 當所有執行緒完成後，打印訊息
            System.out.println("All Threads are finished");
        } catch (InterruptedException e) {
            // 捕捉並處理中斷例外
            e.printStackTrace();
        }
    }
}
