//Ch17_10, 核取方塊與選項方塊的應用
package Ch17.Ch17_10;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ch17_10 {
    static JFrame frm = new JFrame("Checkbox class");
    static JPanel pne = new JPanel();
    static JRadioButton rb1 = new JRadioButton("數位攝影機");
    static JRadioButton rb2 = new JRadioButton("數位相機");

    static JCheckBox ckb1 = new JCheckBox("Sony", true);
    static JCheckBox ckb2 = new JCheckBox("Nikon", true);
    static JCheckBox ckb3 = new JCheckBox("Other");

    public static void main(String[] args) {
        rb1.setBounds(30, 20, 90, 20);
        rb2.setBounds(140, 20, 78, 20);
        ckb1.setBounds(50, 60, 140, 20);
        ckb2.setBounds(50, 80, 140, 20);
        ckb3.setBounds(50, 100, 140, 20);

        ButtonGroup bgroup = new ButtonGroup(); // 建立 ButtonGroup 物件，組合多個按鈕實現單選功能
        bgroup.add(rb1); // 將 rb1 加入 ButtonGroup，使其與其他按鈕只能單選一個
        bgroup.add(rb2); // 將 rb2 加入 ButtonGroup，使其與其他按鈕只能單選一個
        rb1.setSelected(true); // 設定 rb1 為預設選中的按鈕
        pne.add(rb1);
        pne.add(rb2);
        pne.add(ckb1);
        pne.add(ckb2);
        pne.add(ckb3);
        pne.setLayout(null);
        frm.add(pne);
        frm.setSize(270, 180);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
