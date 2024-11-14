//Ch7_11,利用引數個數的不同來多載函數的範例
package Ch7.Ch7_11;

public class Ch7_11 {
    public static void main(String[] args) {
        star();
        star(7);
        star('@', 9);
    }

    public static void star() {
        star(5);
    }

    public static void star(int n) {
        star('*', n);
    }

    public static void star(char ch, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(ch);
        System.out.println();
    }
}
