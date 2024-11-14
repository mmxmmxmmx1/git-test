//第九章 習題 9-13 依照9-11新增Fraction add(raction f)
package Exam.Ex9.Ex9_13;

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

    // 添加分數的方法，接收另一個 Fraction 物件，返回相加後的結果
    public Fraction add(Fraction f) {
        int newNum = this.num * f.getD() + f.getN() * this.den;
        int newDen = this.den * f.getD();
        return new Fraction(newNum, newDen);
    }
}

// 定義主類 Ex9_11，包含 main 方法
public class Ex9_13 {
    public static void main(String[] args) {
        // 創建 Fraction 類的實例 f1 和 f2，初始值分別為 3/5 和 1/4
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(1, 4);
        // 將 f1 和 f2 相加，結果存儲在 result 中
        Fraction result = f1.add(f2);
        // 顯示相加後的結果
        result.show();
    }
}
