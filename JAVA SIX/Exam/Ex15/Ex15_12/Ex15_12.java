// Ex15_12 , 電話卡200元使用幾次後的餘額會低於10元
package Exam.Ex15.Ex15_12;

// 定義 PrePaid 類別，繼承自 Thread
class PrePaid extends Thread {
    // 靜態變量 sum，表示預付卡餘額
    private static int sum = 200;
    // 記錄使用次數的變量 count
    private int count = 1;

    // 重寫 run 方法，定義執行緒行為
    public void run() {
        try {
            // 使執行緒休眠500毫秒，模擬延遲
            Thread.sleep(500);
            // 當餘額大於10元時，繼續扣費
            while (sum > 10) {
                // 隨機生成一個0到99之間的費用
                int fee = (int) ((Math.random() * 99));
                // 減去費用
                sum = sum - fee;
                // 如果扣費後餘額仍大於10元，輸出扣費訊息並增加使用次數
                if (sum > 10) {
                    System.out.println("打了 " + fee + " 元" + ", 餘額 " + sum + ",使用次數 " + count);
                    count++;
                } else {
                    // 如果餘額不足10元，輸出警告訊息
                    System.out.println("餘額不足10元了!");
                }
            }
        } catch (InterruptedException e) {
            // 捕捉並處理中斷例外
            e.printStackTrace();
        }
    }
}

public class Ex15_12 {
    public static void main(String[] args) {
        // 創建三個 PrePaid 執行緒
        PrePaid phone1 = new PrePaid();
        PrePaid phone2 = new PrePaid();
        PrePaid phone3 = new PrePaid();

        // 按順序啟動並等待每個執行緒完成
        phone1.start(); // 啟動 phone1 執行緒
        try {
            // 等待 phone1 執行完畢
            phone1.join();
            // 啟動 phone2 執行緒
            phone2.start();
            // 等待 phone2 執行完畢
            phone2.join();
            // 啟動 phone3 執行緒
            phone3.start();
            // 等待 phone3 執行完畢
            phone3.join();
        } catch (InterruptedException e) {
            // 捕捉並處理中斷例外
            e.printStackTrace();
        }
    }
}
