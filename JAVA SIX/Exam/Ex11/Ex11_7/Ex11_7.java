//第11章 習題題Ex11_7,多重繼承的練習，重點是費氏數列的用法
package Exam.Ex11.Ex11_7;

// 定義 MyMath 介面，包含基本的數學運算方法
interface MyMath {
    void show(); // 用於顯示計算結果

    public void add(int a, int b); // 加法

    public void sub(int a, int b); // 減法

    public void mul(int a, int b); // 乘法

    public void div(int a, int b); // 除法
}

// 定義 AdvanceMath 介面，包含進階的數學運算方法
interface AdvanceMath {
    public void mod(int a, int b); // 取模

    public void fac(int a); // 計算費氏數列

    public void pow(int a, int b); // 次方
}

// 定義 Compute 類別，實作 MyMath 和 AdvanceMath 介面
class Compute implements MyMath, AdvanceMath {
    int ans; // 用於儲存計算結果

    // 加法實作
    public void add(int a, int b) {
        ans = a + b;
    }

    // 減法實作
    public void sub(int a, int b) {
        ans = a - b;
    }

    // 乘法實作
    public void mul(int a, int b) {
        ans = a * b;
    }

    // 除法實作
    public void div(int a, int b) {
        ans = a / b;
    }

    // 取模實作
    public void mod(int a, int b) {
        ans = a % b;
    }

    // 計算費氏數列實作
    public void fac(int a) {
        ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
    }

    // 次方實作
    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }

    // 顯示計算結果
    public void show() {
        System.out.println("ans= " + ans);
    }
}

// 主程式
public class Ex11_7 {
    public static void main(String[] args) {
        Compute cp = new Compute(); // 建立 Compute 物件
        cp.mul(3, 5); // 進行乘法計算 3 * 5
        cp.show(); // 顯示乘法結果，應為 15
        cp.mod(14, 5); // 進行取模計算 14 % 5
        cp.show(); // 顯示取模結果，應為 4
        cp.fac(5); // 計算費氏數列的第 5 項
        cp.show(); // 顯示費氏數列結果，應為 5 (費氏數列的前幾項是 0, 1, 1, 2, 3, 5)
    }
}