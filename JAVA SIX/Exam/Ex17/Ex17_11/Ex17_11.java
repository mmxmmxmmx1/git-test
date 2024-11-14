// 範例程式 Ex17_11 - 委派事件模式
package Exam.Ex17.Ex17_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 主類別 Ex17_11
public class Ex17_11 {

    // 定義兩個按鈕和一個標籤的成員變數
    private static JButton redBtn;
    private static JButton greenBtn;
    private static JLabel lab;

    // 內部類別 ActLis，用來處理按鈕點擊事件
    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // 取得觸發事件的按鈕（來源）
            JButton btnColor = (JButton) e.getSource();

            // 根據來源按鈕來設置標籤的背景顏色
            if (btnColor == redBtn) {
                lab.setBackground(Color.RED); // 若紅色按鈕被點擊，設置背景為紅色
            } else if (btnColor == greenBtn) {
                lab.setBackground(Color.GREEN); // 若綠色按鈕被點擊，設置背景為綠色
            }
        }
    }

    // 主程式進入點
    public static void main(String[] args) {
        // 建立主視窗，設定標題為 "JButton & JLabel"
        JFrame frm = new JFrame("JButton & JLabel");

        // 建立一個面板用來容納按鈕和標籤
        JPanel pne = new JPanel();

        // 載入紅色圖片並縮放成指定大小，然後用於紅色按鈕的圖示
        ImageIcon red = new ImageIcon(Ex17_11.class.getClassLoader().getResource("Exam/Ex17/Ex17_11/red.jpg"));
        Image img1 = red.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
        ImageIcon redIcon = new ImageIcon(img1);

        // 建立紅色按鈕，並設置按鈕文字和圖示
        redBtn = new JButton("Red", redIcon);
        redBtn.setHorizontalTextPosition(JButton.RIGHT); // 文字顯示在圖示右側
        redBtn.setVerticalAlignment(JButton.NORTH); // 垂直對齊方式為上方

        // 載入綠色圖片並縮放成指定大小，然後用於綠色按鈕的圖示
        ImageIcon green = new ImageIcon(Ex17_11.class.getClassLoader().getResource("Exam/Ex17/Ex17_11/green.jpg"));
        Image img2 = green.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
        ImageIcon greenIcon = new ImageIcon(img2);

        // 建立綠色按鈕，並設置按鈕文字和圖示
        greenBtn = new JButton("Green", greenIcon);
        greenBtn.setHorizontalTextPosition(JButton.RIGHT); // 文字顯示在圖示右側
        greenBtn.setVerticalAlignment(JButton.NORTH); // 垂直對齊方式為上方

        // 建立標籤並設定初始文字
        lab = new JLabel("Make hay while the sun shines.");
        lab.setOpaque(true); // 設定標籤為不透明，使背景顏色可見
        lab.setHorizontalTextPosition(JLabel.CENTER); // 設置文字水平置中

        // 建立事件處理器物件
        ActLis actLis = new ActLis();

        // 為紅色和綠色按鈕添加相同的 ActionListener
        redBtn.addActionListener(actLis);
        greenBtn.addActionListener(actLis);

        // 將按鈕和標籤添加到面板中
        pne.add(redBtn);
        pne.add(greenBtn);
        pne.add(lab);

        // 將面板添加到主視窗中
        frm.add(pne);

        // 設置主視窗的大小
        frm.setSize(350, 160);

        // 設置主視窗為可見
        frm.setVisible(true);

        // 設置關閉主視窗時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
