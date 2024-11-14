//第九章 習題 9-11 Fraction
package Exam.Ex9.Ex9_11;
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

    // 顯示分數的方法，輸出形式為 "分子/分母"
    public void show() {
        int n = num; // 獲取分子
        int d = den; // 獲取分母
        System.out.println(n + "/" + d); // 打印分數
    }
}

// 定義主類 Ex9_11，包含 main 方法
public class Ex9_11 {
    public static void main(String[] args) {
        // 創建一個 Fraction 類的實例 f，初始值為 5/3
        Fraction f = new Fraction(5, 3);
        // 顯示當前分數
        f.show();
        // 將分子設置為 7
        f.setN(7);
        // 將分母設置為 12
        f.setD(12);
        // 顯示當前分數
        f.show();
        // 將分子和分母同時設置為 100 和 120
        f.setND(100, 120);
        // 顯示當前分數
        f.show();
    }
}