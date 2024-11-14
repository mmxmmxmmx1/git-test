//Ch7_9, 簡單的遞迴函數
package Ch7.Ch7_9;

public class Ch7_9 {
    public static void main(String[] args) {
        System.out.printf("1*2...*4=%d\n", fac(4));
    }

    public static long fac(long n) { // fac()函數
        if (n >= 1) // 當n>=0時
            return n * fac(n - 1);
        else // 當n=0時
            return 1;
    }
}
