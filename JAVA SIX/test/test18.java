package test;
class CData extends Thread {
    // 靜態變量 sum，表示共享餘額
    private static int sum = 3000;
    private static final Object lock = new Object(); // 鎖對象，用於同步
    // 每次扣減的數量和休眠時間
    private int n;
    private int sec;

    // 構造函數
    public CData(int a, int s) {
        n = a;
        sec = s;
    }

    // 重寫 run 方法，定義執行緒行為
    public void run() {
        while (true) {
            synchronized (lock) {
                if (sum <= 0) {
                    break; // 餘額小於等於0時跳出迴圈
                }
                int tmp = sum - n;
                if (tmp >= 0) {
                    sum = tmp;
                    System.out.println(Thread.currentThread().getName() + " 減 " + n + " 後，餘數為 " + sum);
                } else {
                    System.out.println(Thread.currentThread().getName() + " 餘數不足");
                    break;
                }
                try {
                    // 使執行緒休眠 s 毫秒，模擬延遲
                    Thread.sleep(sec);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // 創建三個 CData 執行緒
        CData d1 = new CData(5, 1500);
        CData d2 = new CData(9, 1000);
        CData d3 = new CData(8, 2000);

        // 啟動三個執行緒
        d1.start();
        d2.start();
        d3.start();
    }
}