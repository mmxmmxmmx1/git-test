//Ex17_4，使用Swing物件來建立簡單的GUI
package Exam.Ex17.Ex17_4;

import java.awt.*;
import javax.swing.*;

public class Ex17_4 {
    // 建立一個 JPanel，將所有的按鈕組件加入其中
    static JPanel pne = new JPanel();

    // 加載 "OK" 圖片資源，並進行縮放處理
    static ImageIcon ok = new ImageIcon(Ex17_4.class.getClassLoader().getResource("Exam/Ex17/Ex17_4/checkbox1.jpg"));
    static Image img1 = ok.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
    static ImageIcon OK = new ImageIcon(img1);

    // 加載 "Cancel" 圖片資源，並進行縮放處理
    static ImageIcon cancel = new ImageIcon(
            Ex17_4.class.getClassLoader().getResource("Exam/Ex17/Ex17_4/checkbox2.jpg"));
    static Image img2 = cancel.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
    static ImageIcon CANCEL = new ImageIcon(img2);

    // 創建按鈕 "OK"，並使用縮放後的圖片作為圖標
    static JButton btn1 = new JButton("OK", OK);

    // 創建按鈕 "Cancel"，並使用縮放後的圖片作為圖標
    static JButton btn2 = new JButton("Cancel", CANCEL);

    public static void main(String[] args) {
        // 創建 JFrame 以容納所有 GUI 元件
        JFrame frm = new JFrame("Frame 4");

        // 設定按鈕上的文字相對於圖標的位置
        btn1.setHorizontalTextPosition(SwingConstants.RIGHT); // 文字顯示在圖片右側
        btn2.setHorizontalTextPosition(SwingConstants.LEFT); // 文字顯示在圖片左側

        // 將按鈕加入到 JPanel 中
        pne.add(btn1);
        pne.add(btn2);

        // 將 JPanel 加入到 JFrame 中
        frm.add(pne);

        // 設定 JFrame 的大小
        frm.setSize(250, 150);

        // 設置視窗為可見
        frm.setVisible(true);

        // 設置當視窗關閉時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
