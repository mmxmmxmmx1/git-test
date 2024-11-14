//第11章 習題題Ex11_11,介面的延伸,定義Show_ans介面跟MyMath繼承Show_ans
package Exam.Ex11.Ex11_11;

// 定義介面 Show_ans
interface Show_ans {
    public void show();  // 定義顯示結果的方法
}

// 定義介面 MyMath，繼承自 Show_ans
interface MyMath extends Show_ans {
    public void add(int a, int b);  // 定義加法運算的方法
    public void sub(int a, int b);  // 定義減法運算的方法
    public void mul(int a, int b);  // 定義乘法運算的方法
    public void div(int a, int b);  // 定義除法運算的方法
}

// 定義類別 Compute，實作介面 MyMath
class Compute implements MyMath {
    protected double num;  // 儲存運算結果的變數

    // 實作加法運算的方法
    public void add(int a, int b) {
        num = (double) a + b;
    }

    // 實作減法運算的方法
    public void sub(int a, int b) {
        num = (double) a - b;
    }

    // 實作除法運算的方法
    public void div(int a, int b) {
        num = (double) a / b;
    }

    // 實作乘法運算的方法
    public void mul(int a, int b) {
        num = (double) a * b;
    }

    // 實作顯示運算結果的方法
    public void show() {
        System.out.printf("ans=%3.1f ", num);
    }
}

// 定義主類別 Ex11_11
public class Ex11_11 {
    // 主方法，程式的進入點
    public static void main(String[] args) {
        Compute cp = new Compute();  // 建立 Compute 類別的實例
        cp.mul(3, 5);  // 呼叫乘法運算方法
        cp.show();     // 呼叫顯示結果的方法
    }
}