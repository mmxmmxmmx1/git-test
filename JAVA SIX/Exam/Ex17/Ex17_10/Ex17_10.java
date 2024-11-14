package Exam.Ex17.Ex17_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex17_10 {
    public static void main(String[] args) {
        // 創建 JFrame 視窗，並設定標題為 "JButton & JLabel"
        JFrame frm = new JFrame("JButton & JLabel");
        
        // 創建 JPanel 來放置按鈕和標籤
        JPanel pne = new JPanel();
        
        // 創建 JLabel 用來顯示圖片及文字
        JLabel lab = new JLabel();

        // 載入並縮放貓圖片
        ImageIcon cat = new ImageIcon(Ex17_10.class.getClassLoader().getResource("Exam/Ex17/Ex17_10/kitty.jpg"));
        Image img1 = cat.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);  // 縮放圖片大小為 300x300 並保持平滑的縮放效果
        ImageIcon catIcon = new ImageIcon(img1);  // 將縮放後的圖片轉為 ImageIcon 物件

        // 載入並縮放狗圖片
        ImageIcon dog = new ImageIcon(Ex17_10.class.getClassLoader().getResource("Exam/Ex17/Ex17_10/puppy.jpg"));
        Image img2 = dog.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);  // 同樣將狗圖片縮放至 300x300
        ImageIcon dogIcon = new ImageIcon(img2);  // 將縮放後的狗圖片轉為 ImageIcon 物件

        // 創建兩個按鈕，分別標記為 "Kitty" 和 "Puppy"
        JButton catBtn = new JButton("Kitty");
        catBtn.setHorizontalTextPosition(JButton.LEFT);  // 設置按鈕上的文字顯示在左側
        JButton dogBtn = new JButton("Puppy");
        dogBtn.setHorizontalTextPosition(JButton.RIGHT);  // 設置按鈕上的文字顯示在右側

        // 添加按鈕和標籤到面板上
        pne.add(catBtn);
        pne.add(dogBtn);
        pne.add(lab);
        frm.add(pne);  // 將面板添加到 JFrame 上

        // 設置初始顯示的圖片與文字
        lab.setIcon(catIcon);  // 顯示貓圖片
        lab.setText("Kitty.jpg");  // 顯示文字 "Kitty.jpg"
        lab.setHorizontalTextPosition(JLabel.CENTER);  // 設置文字水平居中
        lab.setVerticalTextPosition(JLabel.BOTTOM);  // 設置文字顯示在圖片下方

        // 修正的 ActionListener，用來監聽按鈕事件
        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();  // 取得觸發事件的按鈕
                if (btn == catBtn) {  // 如果點擊的是 "Kitty" 按鈕
                    lab.setIcon(catIcon);  // 顯示貓圖片
                    lab.setText("Kitty.jpg");  // 更新標籤文字為 "Kitty.jpg"
                } else if (btn == dogBtn) {  // 如果點擊的是 "Puppy" 按鈕
                    lab.setIcon(dogIcon);  // 顯示狗圖片
                    lab.setText("Puppy.jpg");  // 更新標籤文字為 "Puppy.jpg"
                }
            }
        };

        // 將 ActionListener 添加到兩個按鈕上
        catBtn.addActionListener(buttonListener);
        dogBtn.addActionListener(buttonListener);

        // 設置 JFrame 的大小和其他屬性
        frm.setSize(400, 400);  // 設置視窗大小
        frm.setVisible(true);  // 設置視窗為可見
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 關閉視窗時結束應用程式
    }
}
