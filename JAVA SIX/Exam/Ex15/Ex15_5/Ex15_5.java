//Ex15_5 ,印出5個*跟3個$
package Exam.Ex15.Ex15_5;

// MyPrint 類別實現 Runnable 接口，表示它是一個可以作為執行緒運行的任務
class MyPrint implements Runnable {
    private int n; // 要打印的字符數量
    private char ch; // 要打印的字符

    // 構造方法，用於初始化字符數量和字符
    public MyPrint(int a, char c) {
        n = a;
        ch = c;
    }

    // run 方法是執行緒的入口點，當執行緒啟動時會執行這個方法
    public void run() {
        // 循環打印指定數量的字符
        for (int i = 0; i <= n; i++) {
            System.out.print(ch);
        }
    }
}

// Ex15_5 類別包含主方法，用於啟動應用程序
public class Ex15_5 {
    public static void main(String[] args) {
        // 創建兩個 MyPrint 物件，每個物件表示一個不同的打印任務
        MyPrint s1 = new MyPrint(50, '*'); // 打印 500 個 '*'
        MyPrint s2 = new MyPrint(30, '$'); // 打印 300 個 '$'

        // 創建兩個執行緒，並將 MyPrint 物件作為參數傳遞給執行緒
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        // 啟動兩個執行緒，開始並行執行打印任務
        t1.start();
        t2.start();
    }
}
