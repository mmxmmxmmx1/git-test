//CH15_7 , 執行緒的優先順序
package Ch15.Ch15_7;

class CTest extends Thread {
    private String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(id + " is running..Priority=" + this.getPriority());
        }
    }
}

public class Ch15_7 {
    public static void main(String[] args) {
        CTest dog = new CTest("doggy");
        CTest cat = new CTest("kitty");
        CTest rabbit = new CTest("rabbit");
        CTest sheep = new CTest("sheep");
        CTest horse = new CTest("horse");
        cat.setPriority(Thread.MAX_PRIORITY);
        dog.setPriority(Thread.MIN_PRIORITY);
        rabbit.setPriority(7);
        horse.setPriority(3);

        dog.start();
        cat.start();
        rabbit.start();
        sheep.start();
        horse.start();
    }
}
