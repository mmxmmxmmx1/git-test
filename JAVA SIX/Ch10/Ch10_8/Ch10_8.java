//Ch10_8，透過super關鍵字來存取父類別的變數
package Ch10.Ch10_8;

class Caaa {
    protected int num; // 父類別的資料成員num

    public void show() {
        System.out.println("Caaa_num=" + num);
    }
}

class Cbbb extends Caaa {
    int num = 10; // 子類別的資料成員num

    public void show() { // 設定父類別的資料成員num為20
        super.num = 20;
        System.out.println("Cbbb_num=" + num);
        super.show(); // 呼叫父類別的show ()函數
    }
}

public class Ch10_8 {
    public static void main(String[] args) {
        Cbbb b = new Cbbb();
        b.show();
    }
}
