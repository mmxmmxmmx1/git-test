//Ch17_11 , 捲軸的實例應用
package Ch17.Ch17_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch17_11 extends JFrame implements AdjustmentListener {
    static Ch17_11 frm = new Ch17_11();
    static JScrollBar scr = new JScrollBar(); // 建立垂直捲軸scr
    static JLabel lab1 = new JLabel("No cross, nocrown.", JLabel.CENTER);
    static JLabel lab2 = new JLabel("size=20", JLabel.CENTER);

    public static void main(String[] args) {
        frm.setTitle("Scrollbar Demo");
        frm.setSize(300, 150);
        scr.addAdjustmentListener(frm); // 以frm當成src的傾聽者
        scr.setValues(20, 4, 12, 40);// 設定scr相關數值
        frm.add(scr, BorderLayout.EAST);
        frm.add(lab1, BorderLayout.CENTER);
        frm.add(lab2, BorderLayout.SOUTH);

        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int size = scr.getValue(); // 取得scr相關數值
        lab1.setFont(new Font("Dialog", Font.PLAIN, size)); // 設定字型樣式
        lab2.setText("size" + size); // 顯示字體大小
    }
}
