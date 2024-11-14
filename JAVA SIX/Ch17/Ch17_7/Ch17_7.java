//Ch17_7 , 簡單的事件處理範例(已加入事件處理)
package Ch17.Ch17_7;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Ch17_7 extends JFrame implements ActionListener {
    static Ch17_7 frm = new Ch17_7();
    static JButton btn = new JButton("Click Me");

    public static void main(String[] args) {
        btn.addActionListener(frm);         //把frm向btn註冊
        frm.setLayout(new FlowLayout());
        frm.setTitle("Action Event");
        frm.setSize(280, 150);
        frm.add(btn);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {   //事件發生的處裡動作
        frm.getContentPane().setBackground(Color.YELLOW);
    }
}
