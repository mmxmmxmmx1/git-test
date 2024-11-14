// Ex17_6 版面配置與管理範例
package Exam.Ex17.Ex17_6; // 定義套件，組織相關的類別

import javax.swing.*; // 匯入 Swing 套件，用於建立 GUI 元件
import java.awt.*;    // 匯入 AWT 套件，用於佈局管理與圖形處理

public class Ex17_6 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗並設定標題為 "Frame 6"
        JFrame frm = new JFrame("Frame 6");

        // 建立 "Up" 按鈕並添加到 JFrame 的北邊區域 (BorderLayout.NORTH)
        JButton upBtn = new JButton("Up");
        frm.add(upBtn, BorderLayout.NORTH);

        // 建立 "Left" 按鈕並添加到 JFrame 的西邊區域 (BorderLayout.WEST)
        JButton leftBtn = new JButton("Left");
        frm.add(leftBtn, BorderLayout.WEST);

        // 建立 "Right" 按鈕並添加到 JFrame 的東邊區域 (BorderLayout.EAST)
        JButton rightBtn = new JButton("Right");
        frm.add(rightBtn, BorderLayout.EAST);

        // 建立 "Down" 按鈕並添加到 JFrame 的南邊區域 (BorderLayout.SOUTH)
        JButton downBtn = new JButton("Down");
        frm.add(downBtn, BorderLayout.SOUTH);

        // 設定 JFrame 的大小為 240 像素寬度和 150 像素高度
        frm.setSize(240, 150);

        // 設定 JFrame 在啟動時可見，顯示視窗
        frm.setVisible(true);

        // 設定當使用者關閉視窗時，結束程式運行
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
