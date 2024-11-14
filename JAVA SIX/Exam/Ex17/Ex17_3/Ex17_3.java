//Ex17_3 , ，使用Swing物件
package Exam.Ex17.Ex17_3;

import javax.swing.JButton; // 導入JButton類，代表一個按鈕元件
import javax.swing.JFrame; // 導入JFrame類，代表主視窗
import javax.swing.JPanel; // 導入JPanel類，代表容器面板

public class Ex17_3 {
    public static void main(String[] args) {
        // 建立一個名為"Frame 3"的JFrame視窗
        JFrame frm = new JFrame("Frame 3");

        // 建立一個名為"Push Me!"的按鈕
        JButton btn = new JButton("Push Me!");

        // 建立一個JPanel面板
        JPanel pne = new JPanel();

        // 將按鈕加入面板中
        pne.add(btn);

        // 設定按鈕文字顯示在按鈕的上方
        btn.setVerticalTextPosition(JButton.TOP);

        // 設定視窗大小為250x120像素
        frm.setSize(250, 120);

        // 將面板加入視窗中
        frm.add(pne);

        // 設定視窗為可見
        frm.setVisible(true);

        // 設定視窗的關閉行為為退出應用程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
