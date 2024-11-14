// Ex17_8 版面配置與管理範例
package Exam.Ex17.Ex17_8; // 定義套件，用於組織相關的類別

import javax.swing.*; // 匯入 Swing 套件，用於建立圖形使用者介面（GUI）元件
import java.awt.*;    // 匯入 AWT 套件，用於佈局管理與圖形處理

public class Ex17_8 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗並設定標題為 "Frame 8"
        JFrame frm = new JFrame("Frame 8");

        // 建立第一個 JButton 按鈕，標籤為 "Button1"
        JButton btn1 = new JButton("Button1");

        // 建立第二個 JButton 按鈕，標籤為 "Button2"
        JButton btn2 = new JButton("Button2");

        // 建立第三個 JButton 按鈕，標籤為 "Button3"
        JButton btn3 = new JButton("Button3");

        // 設定 JFrame 的佈局管理器為 FlowLayout，元件居中對齊，水平與垂直間距各為 5 像素
        frm.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // 將第一個按鈕添加到 JFrame 中
        frm.add(btn1);

        // 將第二個按鈕添加到 JFrame 中
        frm.add(btn2);

        // 將第三個按鈕添加到 JFrame 中
        frm.add(btn3);

        // 設定 JFrame 的大小為 120 像素寬、150 像素高
        frm.setSize(120, 150);

        // 設定 JFrame 在啟動時可見，顯示視窗
        frm.setVisible(true);

        // 設定當使用者關閉視窗時，結束程式運行
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
