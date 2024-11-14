//Ch15_3 , 實作Runnable 介面來建立執行緒
package Ch15.Ch15_3;

class CTest implements Runnable { // 由CTest類別實作Runnable 介面
    private String id;

    public CTest(String str) { // 建構子，設定成員id
        id = str;
    }

    public void run() { // 詳細定義runnable() 介面裡的run()函數
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 50000; j++) {
                System.out.println(id + " is running...");
            }
        }
    }
}

public class Ch15_3 {
    public static void main(String[] args) {
        CTest dog = new CTest("doggy");
        CTest cat = new CTest("kitty");
        Thread t1 = new Thread(dog);
        Thread t2 = new Thread(cat);
        t1.start();
        t2.start();

    }
}
