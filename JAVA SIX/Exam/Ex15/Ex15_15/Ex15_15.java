//Ex15_15 , 撰寫兩個執行緒 ，一個執行緒可以計算2~100000之間的質數(prime number)的個數，另一個執行緒則可以計算100001~200000
//之間質數的個數
package Exam.Ex15.Ex15_15;

// 定義一個名為 `prime` 的類，並實現 `Runnable` 介面
class prime implements Runnable {
    // 定義區間的開始和結束值
    private int start;
    private int end;
    // 計數質數的數量
    private int count = 0;

    // 建構子，初始化區間的開始和結束值
    public prime(int s, int e) {
        this.start = s;
        this.end = e;
    }

    // 檢查一個數是否為質數的方法
    public boolean primecheck(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        // 檢查從3開始到sqrt(n)之間的奇數是否能整除n
        for (int z = 3; z <= Math.sqrt(n); z += 2) {
            if (n % z == 0) {
                return false;
            }
        }
        return true;
    }

    // 實現 `Runnable` 介面的 `run` 方法，當執行緒啟動時執行此方法
    public void run() {
        // 紀錄開始時間（毫秒）
        long startTime = System.nanoTime() / 1000000;
        // 遍歷區間內的每個數，檢查是否為質數
        for (int i = start; i <= end; i++) {
            if (primecheck(i)) {
                count++;
            }
        }
        // 紀錄結束時間（毫秒）
        long endTime = System.nanoTime() / 1000000;
        // 打印出區間內的質數數量
        System.out.println(start + "到" + end + "總共有:" + count + "個質數");
        // 打印出運行所花費的時間
        System.out.println(start + "~" + end + "總花費時間=" + (endTime - startTime) + "毫秒");
    }
}

// 定義主類 `Ex15_15`
public class Ex15_15 {
    // 主方法
    public static void main(String[] args) {
        // 創建兩個 `prime` 物件，分別負責不同的區間
        prime p = new prime(2, 100000);
        prime p1 = new prime(100001, 200000);

        // 創建兩個執行緒，並傳入對應的 `prime` 物件
        Thread tr = new Thread(p);
        Thread tr1 = new Thread(p1);

        // 啟動兩個執行緒
        tr.start();
        tr1.start();
    }
}
