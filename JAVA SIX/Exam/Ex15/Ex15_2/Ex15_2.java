//Ex15_2 , 使用單執行緒 ,並執行1億次
package Exam.Ex15.Ex15_2;

// 定義一個繼承 Thread 類的 Test 類
class Test extends Thread {
    // 私有變數 id 用於儲存線程的識別字串
    private String id;

    // Test 類的構造函數，接收一個字串參數並賦值給 id 變數
    public Test(String str) {
        id = str;
    }

    // 覆寫 Thread 類的 run 方法，定義線程的執行邏輯
    public void run() {
        // 外層迴圈，從 1 執行到 5
        for (int i = 1; i <= 5; i++) {
            // 內層迴圈，執行 100000000 次（用於模擬密集運算）
            for (int j = 0; j < 10; j++) {
                // 輸出 id 和當前的 i 值
                System.out.println(id + " " + i);
            }
        }
    }
}

// 主類 Ex15_2
public class Ex15_2 {
    // 主方法，程式的進入點
    public static void main(String[] args) {
        // 創建兩個 Test 類的實例，分別使用不同的字串參數
        Test hi = new Test("Hello");
        Test bye = new Test("Good bye");

        // 執行兩個線程的 run 方法（注意：這裡是直接呼叫 run 方法，而不是啟動線程）
        hi.run(); // 直接呼叫 hi 的 run 方法，在當前主線程中執行
        bye.run(); // 直接呼叫 bye 的 run 方法，在當前主線程中執行
    }
}
