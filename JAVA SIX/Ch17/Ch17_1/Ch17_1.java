//Ch17_1 ,Swing 的JFrame練習
package Ch17.Ch17_1;

import javax.swing.JFrame;

public class Ch17_1 {
    public static void main(String[] args) {
        JFrame frm = new JFrame("JFrame 視窗");
        frm.setSize(260, 150); // 設定視窗大小
        frm.setVisible(true);
        // 設定關閉視窗時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
