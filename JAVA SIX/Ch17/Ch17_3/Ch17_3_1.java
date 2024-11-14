package Ch17.Ch17_3;

import javax.swing.*;
import java.awt.*;

public class Ch17_3_1 {
    static JFrame frm = new JFrame("JButton & JLabel");
    static JPanel pne = new JPanel();

    static ImageIcon pic;
    static ImageIcon left = new ImageIcon("Ch17/Ch17_3/left.png");

    static JButton btn1 = new JButton("前一張", left);

    public static void main(String[] args) {
        pne.setLayout(new FlowLayout(FlowLayout.LEFT));
        pne.add(btn1);
        frm.add(pne);

        frm.setSize(400, 300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
