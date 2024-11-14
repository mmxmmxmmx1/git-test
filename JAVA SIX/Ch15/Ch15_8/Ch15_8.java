//Ch15_8 , 沒有同步處理的執行緒
package Ch15.Ch15_8;

class Bank {
    private static int sum = 0;

    public static synchronized void add(int n) {
        int tmp = sum;
        tmp = tmp + n;
        try {
            Thread.sleep((int) (1000 * Math.random()));
        } catch (InterruptedException e) {
        }
        sum = tmp;
        System.out.println("sum= " + sum);
    }
}

class Customer extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            Bank.add(100);
        }
    }
}

public class Ch15_8 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.start();
        c2.start();
    }
}
