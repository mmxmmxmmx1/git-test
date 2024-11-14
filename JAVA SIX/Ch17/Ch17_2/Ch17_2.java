//Ch17_2 , JButton 影像圖示的變化
package Ch17.Ch17_2;

import javax.swing.*;

public class Ch17_2 {
    static JFrame frm = new JFrame("JButton 測試");
    static JPanel pne = new JPanel();

    static ImageIcon general = new ImageIcon("Ch17/Ch17_2/img1.png");
    static ImageIcon rollover = new ImageIcon("Ch17/Ch17_2/img2.png");
    static ImageIcon pressed = new ImageIcon("Ch17/Ch17_2/img3.png");
    static JButton btn = new JButton("Kitten"); // 建立JButton 物件

    public static void main(String[] args) {
        pne.add(btn); // 將按鈕加入容器中
        frm.add(pne); // 將容器加入視窗中
        btn.setRolloverEnabled(true); // 設定滑鼠指標與按鈕有互動效果
        btn.setIcon(general); // 設定在一般情況下，按鈕的圖示
        btn.setRolloverIcon(rollover); // 設定指標在按鈕上方時的圖案
        btn.setPressedIcon(pressed); // 設定滑鼠按鈕按下時的圖案

        frm.setSize(255, 135);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
