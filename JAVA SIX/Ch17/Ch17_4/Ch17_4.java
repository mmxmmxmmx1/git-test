//Ch16_4 ,BorderLayout 類別的使用
package Ch17.Ch17_4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ch17_4 {
    static JFrame frm = new JFrame();

    public static void main(String[] args) {
        frm.setSize(300, 150);
        frm.add(new JButton("East"), BorderLayout.EAST);
        frm.add(new JButton("West"), BorderLayout.WEST);
        frm.add(new JButton("South"), BorderLayout.SOUTH);
        frm.add(new JButton("North"), BorderLayout.NORTH);
        frm.add(new JButton("Center"), BorderLayout.CENTER);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
