package Exam.Ex17.Ex17_5; // 定義套件

import javax.swing.*; // 匯入 javax.swing 套件，處理 GUI 元件
import java.awt.*; // 匯入 java.awt 套件，處理佈局與圖形處理

public class Ex17_5 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗，並設定視窗標題
        JFrame frm = new JFrame("Frame 5");

        // 載入圖檔 checkbox1.jpg，並將其調整為 40x30 的大小後轉換為 ImageIcon
        ImageIcon okIcon = new ImageIcon(Ex17_5.class.getClassLoader().getResource("Exam/Ex17/Ex17_5/checkbox1.jpg"));
        Image img1 = okIcon.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
        ImageIcon OKIcon = new ImageIcon(img1); // 生成縮放後的 OK 按鈕圖標

        // 載入圖檔 flower.png，並將其調整為 180x160 的大小後轉換為 ImageIcon
        ImageIcon flower = new ImageIcon(Ex17_5.class.getClassLoader().getResource("Exam/Ex17/Ex17_5/flower.png"));
        Image img2 = flower.getImage().getScaledInstance(180, 160, Image.SCALE_SMOOTH);
        ImageIcon flowerIcon = new ImageIcon(img2); // 生成縮放後的花朵圖標

        // 建立 JButton 按鈕，並設定文字 "OK" 和使用縮放後的圖標 OKIcon
        JButton btn = new JButton("OK", OKIcon);
        btn.setVerticalTextPosition(SwingConstants.BOTTOM); // 設定文字顯示在圖標下方
        btn.setHorizontalTextPosition(SwingConstants.CENTER); // 設定文字居中
        btn.setPreferredSize(new Dimension(100, 50)); // 設定按鈕大小

        // 建立 JLabel，並使用縮放後的花朵圖標
        JLabel lab = new JLabel(flowerIcon);

        // 建立 JPanel，使用 FlowLayout 將按鈕置中，並將按鈕加入至此 JPanel
        JPanel btnpne = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnpne.add(btn);

        // 建立 JPanel，使用 FlowLayout 將圖標置中，並將圖標加入至此 JPanel
        JPanel labpne = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labpne.add(lab);

        // 設定 JFrame 使用 BorderLayout 佈局
        frm.setLayout(new BorderLayout());

        // 將按鈕面板加入到 JFrame 的南邊
        frm.add(btnpne, BorderLayout.SOUTH);

        // 將圖標面板加入到 JFrame 的中央
        frm.add(labpne, BorderLayout.CENTER);

        // 設定視窗大小，顯示視窗，並設定關閉操作
        frm.setSize(250, 260);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
