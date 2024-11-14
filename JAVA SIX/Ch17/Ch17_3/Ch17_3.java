//Ch17_3 , JButton與JLabel的綜合應用
package Ch17.Ch17_3;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ch17_3 {
    static JFrame frm = new JFrame("JButton & JLabel");
    static JPanel pne = new JPanel();

    static ImageIcon pic;
    static ImageIcon left = new ImageIcon("Ch17/Ch17_3/left.png");
    static ImageIcon right = new ImageIcon("Ch17/Ch17_3/right.png");

    static JButton btn1 = new JButton("前一張", left);
    static JButton btn2 = new JButton("後一張", right);
    static JLabel lab = new JLabel();

    public static void main(String[] args) {
        // 載入圖片
        pic = new ImageIcon("Ch17/Ch17_3/pic0.png");
        // 設定文字水平位置
        btn2.setHorizontalTextPosition(JButton.LEFT);
        pne.add(btn1);
        pne.add(btn2);
        pne.add(lab);
        frm.add(pne);
        lab.setIcon(pic);
        lab.setText("pic0.png");
        // 設定文字水平位置
        lab.setHorizontalTextPosition(JLabel.CENTER);
        // 設定文字垂直位置
        lab.setVerticalTextPosition(JLabel.BOTTOM);
        frm.setSize(400, 300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
