// Ex17_7 版面配置與管理範例
package Exam.Ex17.Ex17_7; // 定義套件，組織相關的類別

import javax.swing.*; // 匯入 Swing 套件，用於建立 GUI 元件
import java.awt.*;    // 匯入 AWT 套件，用於佈局管理與顏色處理

public class Ex17_7 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗並設定標題為 "Frame 7"
        JFrame frm = new JFrame("Frame 7");

        // 建立 JTextField 文本欄位，初始文字為 "Honesty is the best policy."
        JTextField txf = new JTextField("Honesty is the best policy.");

        // 設定 JTextField 的背景顏色為橘色
        txf.setBackground(Color.ORANGE);

        // 建立第一個 JButton 按鈕，標籤為 "OK"
        JButton okBtn = new JButton("OK");

        // 建立第二個 JButton 按鈕，標籤為 "Exit"
        JButton exitBtn = new JButton("Exit");

        // 設定 JFrame 的佈局管理器為 FlowLayout，居中對齊，水平間距 9 像素，垂直間距 0 像素
        frm.setLayout(new FlowLayout(FlowLayout.CENTER, 9, 0));

        // 將 JTextField 添加到 JFrame
        frm.add(txf);

        // 將第一個 JButton 添加到 JFrame
        frm.add(okBtn);

        // 將第二個 JButton 添加到 JFrame
        frm.add(exitBtn);

        // 設定 JFrame 的大小為 230 像素寬，120 像素高
        frm.setSize(230, 120);

        // 設定 JFrame 在啟動時可見，顯示視窗
        frm.setVisible(true);

        // 設定當使用者關閉視窗時，結束程式運行
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
