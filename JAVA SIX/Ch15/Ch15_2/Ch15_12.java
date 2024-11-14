//Ch15_2, 啟動多執行緒的範例
package Ch15.Ch15_2;

class CTest extends Thread {
    private String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20000; j++) {
                System.out.println(id + " is running...");
            }
        }
    }
}

public class Ch15_12 {
    public static void main(String[] args) {
        CTest dog = new CTest("doggy");
        CTest cat = new CTest("kitty");
        dog.start();
        cat.start();
    }
}
