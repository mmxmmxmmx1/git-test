//Ex12_2 , 數學函數的使用
//將Max類別與Ex12_2類別分開成兩個檔案存放，然後變異並執行。
package Exam.Ex12.Ex12_2;

import Exam.Ex12.Max.*;

public class Ex12_2 {
    public static void main(String[] args) {
        Max m = new Max(3, 15);
        System.out.println("Max(3,15)=" + m.cmpare());
    }
}
