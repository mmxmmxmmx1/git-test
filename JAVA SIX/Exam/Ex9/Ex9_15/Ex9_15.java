//第九章 習題 9-15 依照9-11在Fraction 類別寫void larger(Fraction f2)
package Exam.Ex9.Ex9_15;

// 定義一個 Fraction 類別，用於表示分數
class Fraction {
    // 定義兩個私有成員變數：分子和分母
    private int num, den;

    // 建構子，接收兩個參數 n 和 d，分別初始化分子和分母
    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    // 設定分子的 setter 方法
    public void setN(int n) {
        num = n;
    }

    // 設定分母的 setter 方法
    public void setD(int d) {
        den = d;
    }

    // 同時設定分子和分母的 setter 方法
    public void setND(int num, int den) {
        this.num = num;
        this.den = den;
    }

    // 返回分子的 getter 方法
    public int getN() {
        return num;
    }

    // 返回分母的 getter 方法
    public int getD() {
        return den;
    }

    // 顯示分數的方法，輸出形式為 "分子/分母"
    public void show() {
        int n = num; // 獲取分子
        int d = den; // 獲取分母
        System.out.println(n + "/" + d); // 打印分數
    }

    // 比較當前 Fraction 對象與傳入的 Fraction 對象的大小
    public void larger(Fraction f2) {
        // 比較 this 和 f2 的值，分數比較可以通過交叉乘法進行比較
        if (this.num * f2.den > f2.num * this.den) {
            System.out.println("f1 is larger");
        } else {
            System.out.println("f2 is larger");
        }
    }
}

// 定義主類 Ex9_15，包含 main 方法
public class Ex9_15 {
    public static void main(String[] args) {
        // 創建 Fraction 類的實例 f1 和 f2，初始值分別為 2/3 和 1/2
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 2);

        // 比較 f1 和 f2 的大小，並顯示結果
        f1.larger(f2);
    }
}
