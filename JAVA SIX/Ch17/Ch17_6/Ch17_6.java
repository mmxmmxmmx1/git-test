//Ch16_6 , 間單的事件處理範例(未加入事件處理)
package Ch17.Ch17_6;

import javax.swing.*;
import java.awt.*;

public class Ch17_6 extends JFrame { // 設定Ch17_6類別繼承自JFrame類別
    static Ch17_6 frm = new Ch17_6();
    static JButton btn = new JButton("Click Me"); // 建立Ch17_6 類別的物件frm

    public static void main(String[] args) {
        frm.setLayout(new FlowLayout());
        frm.setTitle("Action Event");
        frm.setSize(280,150);
        frm.add(btn);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
