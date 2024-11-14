// Ex17_14 , 更多類型的元件
package Exam.Ex17.Ex17_14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex17_14 {
    public static void main(String[] args) {
        // 使用 Swing 的事件分派線程來確保線程安全
        SwingUtilities.invokeLater(() -> {
            // 創建主框架並設置標題
            JFrame frm = new JFrame("更多類型的元件示例");
            frm.setLayout(new BorderLayout()); // 設置框架的佈局管理器為 BorderLayout

            // 創建單選按鈕
            JRadioButton absBtn = new JRadioButton("絕對值");
            JRadioButton squBtn = new JRadioButton("平方值");
            JRadioButton cubBtn = new JRadioButton("立方值");

            // 將單選按鈕加入按鈕組，確保同一時間只能選擇一個
            ButtonGroup bgBtn = new ButtonGroup();
            bgBtn.add(absBtn);
            bgBtn.add(squBtn);
            bgBtn.add(cubBtn);
            absBtn.setSelected(true); // 預設選擇「絕對值」

            // 創建一個面板來放置單選按鈕，並設置為居中對齊
            JPanel pen = new JPanel(new FlowLayout(FlowLayout.CENTER));
            pen.add(absBtn);
            pen.add(squBtn);
            pen.add(cubBtn);

            // 創建另一個面板來放置輸入欄位和計算按鈕
            JPanel pen1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JTextField txf = new JTextField("x="); // 顯示 "x=" 的文字欄位
            txf.setEditable(false); // 設置為不可編輯
            JTextField txf1 = new JTextField(10); // 用戶輸入數字的文字欄位，最多顯示10個字符
            JButton calBtn = new JButton("計算"); // 計算按鈕

            // 將元件加入 pen1 面板
            pen1.add(txf);
            pen1.add(txf1);
            pen1.add(calBtn);

            JLabel answerLab = new JLabel(); // 顯示計算結果的標籤
            JPanel pne2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            pne2.add(answerLab);

            // 為計算按鈕添加事件監聽器
            calBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // 解析用戶輸入的數字
                        double input = Double.parseDouble(txf1.getText());
                        double result = 0;
                        String operation = "";

                        // 根據選擇的單選按鈕執行相應的計算
                        if (absBtn.isSelected()) {
                            result = Math.abs(input);
                            operation = "絕對值";
                        } else if (squBtn.isSelected()) {
                            result = Math.pow(input, 2);
                            operation = "平方值";
                        } else if (cubBtn.isSelected()) {
                            result = Math.pow(input, 3);
                            operation = "立方值";
                        }

                        // 在標籤上顯示計算結果
                        answerLab.setText(operation + "(" + input + ") = " + result);

                    } catch (NumberFormatException E) {
                        // 如果輸入無效，顯示錯誤訊息對話框
                        JOptionPane.showMessageDialog(null, "請輸入有效的數字！", "錯誤", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            // 將各個面板和標籤加入主框架
            frm.add(pen, BorderLayout.NORTH); // 將單選按鈕面板放在北方
            frm.add(pen1, BorderLayout.CENTER); // 將輸入欄位和計算按鈕面板放在中間
            frm.add(pne2, BorderLayout.SOUTH); // 將結果標籤放在南方

            // 設置框架的大小
            frm.setSize(300, 170);
            frm.setVisible(true); // 顯示框架
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設置關閉操作
        });
    }
}
