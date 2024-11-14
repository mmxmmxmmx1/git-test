// Ex17_12 更多類型的元件
package Exam.Ex17.Ex17_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex17_12 {
    // 宣告靜態的 JRadioButton 和 JLabel，使內部類別可以訪問
    private static JRadioButton rbcat;
    private static JRadioButton rbdog;
    private static JRadioButton rbflower;
    private static JLabel lab;

    /**
     * 初始化三個 JRadioButton 元件
     */
    public static void button() {
        rbcat = new JRadioButton("kitty");    // 創建「kitty」單選按鈕
        rbdog = new JRadioButton("puppy");    // 創建「puppy」單選按鈕
        rbflower = new JRadioButton("avage"); // 創建「avage」單選按鈕（建議修正為 "flower"）
    }

    /**
     * 將三個 JRadioButton 添加到 ButtonGroup 中，確保一次只能選取一個按鈕
     */
    public static void bgGroup() {
        ButtonGroup bg = new ButtonGroup(); // 創建 ButtonGroup 以管理單選按鈕
        bg.add(rbcat);      // 將「kitty」按鈕加入 ButtonGroup
        bg.add(rbdog);      // 將「puppy」按鈕加入 ButtonGroup
        bg.add(rbflower);   // 將「avage」按鈕加入 ButtonGroup
    }

    /**
     * 初始化 JLabel 元件，並設置其對齊方式
     */
    public static void label() {
        lab = new JLabel();                        // 創建 JLabel 用於顯示圖片
        lab.setHorizontalAlignment(JLabel.CENTER); // 設定 JLabel 的水平對齊方式為置中
        lab.setVerticalAlignment(JLabel.CENTER);   // 設定 JLabel 的垂直對齊方式為置中
    }

    /**
     * 靜態內部類別 ActLis，實作 ActionListener 介面，用於處理單選按鈕的事件
     */
    static class ActLis implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 取得觸發事件的元件，並轉型為 JRadioButton
            JRadioButton btnPic = (JRadioButton) e.getSource();

            // 根據選取的按鈕設置 JLabel 的圖示
            if (btnPic.equals(rbcat)) {
                // 加載貓咪圖片
                ImageIcon cat = new ImageIcon(
                        Ex17_12.class.getClassLoader().getResource("Exam/Ex17/Ex17_12/kitty.jpg"));
                // 縮放圖片至 250x250 像素，使用快速縮放模式
                Image img1 = cat.getImage().getScaledInstance(250, 250, Image.SCALE_FAST);
                ImageIcon catIcon = new ImageIcon(img1); // 創建縮放後的 ImageIcon
                lab.setIcon(catIcon); // 設置 JLabel 的圖示為貓咪圖片
            } else if (btnPic.equals(rbdog)) {
                // 加載小狗圖片
                ImageIcon dog = new ImageIcon(
                        Ex17_12.class.getClassLoader().getResource("Exam/Ex17/Ex17_12/puppy.jpg"));
                // 縮放圖片至 250x250 像素，使用快速縮放模式
                Image img2 = dog.getImage().getScaledInstance(250, 250, Image.SCALE_FAST);
                ImageIcon dogIcon = new ImageIcon(img2); // 創建縮放後的 ImageIcon
                lab.setIcon(dogIcon); // 設置 JLabel 的圖示為小狗圖片
            } else if (btnPic.equals(rbflower)) {
                // 加載花朵圖片
                ImageIcon flower = new ImageIcon(
                        Ex17_12.class.getClassLoader().getResource("Exam/Ex17/Ex17_12/flower.jpg"));
                // 縮放圖片至 250x250 像素，使用快速縮放模式
                Image img3 = flower.getImage().getScaledInstance(250, 250, Image.SCALE_FAST);
                ImageIcon flowerIcon = new ImageIcon(img3); // 創建縮放後的 ImageIcon
                lab.setIcon(flowerIcon); // 設置 JLabel 的圖示為花朵圖片
            }
        }
    }

    /**
     * 為每個 JRadioButton 添加 ActionListener 事件監聽器
     */
    public static void click() {
        ActLis actLis = new ActLis();           // 創建 ActLis 實例作為事件處理器
        rbcat.addActionListener(actLis);        // 將事件處理器添加到「kitty」按鈕
        rbdog.addActionListener(actLis);        // 將事件處理器添加到「puppy」按鈕
        rbflower.addActionListener(actLis);     // 將事件處理器添加到「avage」按鈕
    }

    /**
     * 主方法，建立並顯示 GUI
     */
    public static void main(String[] args) {
        JFrame frm = new JFrame("JRadioButton"); // 創建主視窗，標題為 "JRadioButton"
        JPanel pne = new JPanel();               // 創建主面板

        button();     // 初始化單選按鈕
        bgGroup();    // 將單選按鈕加入 ButtonGroup
        label();      // 初始化 JLabel
        click();      // 為單選按鈕添加事件監聽器

        // 將單選按鈕和 JLabel 添加到主面板中
        pne.add(rbcat);
        pne.add(rbdog);
        pne.add(rbflower);
        pne.add(lab);

        frm.add(pne);                        // 將主面板添加到主視窗中
        frm.setVisible(true);                // 設定主視窗為可見
        frm.setSize(400, 400);                // 設定主視窗的大小為 400x400 像素
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉視窗時結束程式
    }
}
