//Ch15_4, Ch15_5 sleep()函數的示範
package Ch15.Ch15_4;

class CTest extends Thread { // 從Thread類別延伸出子類別
    private String id;

    public CTest(String str) { // 建構子，設定成員id
        id = str;
    }

    public void run() { // 改寫Thread類別裡的run()函數
        for (int i = 0; i < 4; i++) {
            try {
                sleep((int) (1000 * Math.random())); //
            } catch (InterruptedException e) { // sleep()必須寫在try-catch區塊裡
            } //
            System.out.println(id + " is running...");
        }
    }
}

public class Ch15_4 {
    public static void main(String[] args) {
        CTest dog = new CTest("doggy");
        CTest cat = new CTest("kitty");
        Thread t1 = new Thread(dog);
        Thread t2 = new Thread(cat);
        t1.start();
        t2.start();
        System.out.println("main(() finished");
    }
}
