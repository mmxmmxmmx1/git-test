//第10章 習題Ex10_4,修正錯誤
package Exam.Ex10.Ex10_4;

class Caaa {
    private int num;

    // 帶參數的建構子，用來初始化 num 變數
    public Caaa(int n) {
        num = n;
    }

    // 公共方法，返回 num 的值
    public int get() {
        return num;
    }
}

class Cbbb extends Caaa {
/*因Caaa設有(int n)而原本Cbbb並沒有建構子public Cbbb(int n),所以並沒有辦法
 *繼承到Caaa(int n)的值,所以多了Cbbb(int n)建構子後，就能正確執行程式碼了。
 */
    public Cbbb(int n) {
        super(n);
    }

    // 公共方法，用來顯示 num 的值
    public void show() {
        System.out.println("num=" + get());
    }
}

public class Ex10_4 {
    public static void main(String[] args) {
        // 創建 Cbbb 類別的實例並傳入參數 2
        Cbbb bb = new Cbbb(2);
        
        // 調用 show 方法，顯示 num 的值
        bb.show(); // 輸出: num: 2
    }
}
