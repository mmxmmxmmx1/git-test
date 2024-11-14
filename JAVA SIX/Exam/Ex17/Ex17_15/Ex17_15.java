// 範例 Ex17_15: 更多類型的元件
package Exam.Ex17.Ex17_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex17_15 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗，標題為 "JFrame"
        JFrame frm = new JFrame("JFrame");

        // 建立單選按鈕 "奇數" 和 "偶數"
        JRadioButton oddBtn = new JRadioButton("奇數");
        JRadioButton evenBtn = new JRadioButton("偶數");
        oddBtn.setSelected(true); // 預設選擇 "奇數"

        // 建立 ButtonGroup 以確保 "奇數" 和 "偶數" 互斥選擇
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(oddBtn);
        bGroup.add(evenBtn);

        // 建立一個 JPanel 使用 FlowLayout，並添加元件
        JPanel pne = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField txf = new JTextField("From");
        txf.setEditable(false); // 設定文字框不可編輯
        JTextField txf1 = new JTextField(5); // 輸入框，讓使用者輸入範圍開始值
        JTextField txf2 = new JTextField("To");
        txf2.setEditable(false); // 設定文字框不可編輯
        JTextField txf3 = new JTextField(5); // 輸入框，讓使用者輸入範圍結束值

        // 將所有元件添加到 JPanel
        pne.add(oddBtn);
        pne.add(evenBtn);
        pne.add(txf);
        pne.add(txf1);
        pne.add(txf2);
        pne.add(txf3);

        // 建立按鈕及文字區域的 JPanel
        JPanel startPne = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton startBtn = new JButton("Start"); // "Start" 按鈕
        JTextArea txtArea = new JTextArea(8, 40); // 創建文字區域顯示結果
        txtArea.setLineWrap(true); // 設定文字自動換行
        txtArea.setWrapStyleWord(true); // 設定自動換行時不切割單詞
        txtArea.setColumns(40); // 設定列數

        // 將 "Start" 按鈕添加到面板
        startPne.add(startBtn);

        // 為文字區域添加滾動條
        JScrollPane scr = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // 添加按鈕事件監聽器，點擊 "Start" 後觸發的事件
        startBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 獲取使用者輸入的數字範圍
                    int input1 = Integer.parseInt(txf1.getText());
                    int input2 = Integer.parseInt(txf3.getText());
                    txtArea.setText(""); // 清空文字區域

                    // 根據選擇顯示奇數或偶數
                    if (oddBtn.isSelected()) {
                        for (int x = input1; x <= input2; x++) {
                            if (x % 2 != 0) {
                                txtArea.append(x + " "); // 如果是奇數，則添加到文字區域
                            }
                        }
                    } else if (evenBtn.isSelected()) {
                        for (int x = input1; x <= input2; x++) {
                            if (x % 2 == 0) {
                                txtArea.append(x + " "); // 如果是偶數，則添加到文字區域
                            }
                        }
                    }
                } catch (NumberFormatException E) {
                    // 如果輸入不是有效數字，則顯示錯誤提示框
                    JOptionPane.showMessageDialog(null, "請輸入有效的數字！", "錯誤", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // 將面板添加到 JFrame 中，並設定佈局
        frm.add(pne, BorderLayout.NORTH); // 添加上方的輸入面板
        frm.add(startPne, BorderLayout.CENTER); // 添加中間的按鈕面板
        frm.add(scr, BorderLayout.SOUTH); // 添加下方的文字區域滾動面板
        frm.setSize(330, 250); // 設定視窗大小
        frm.setVisible(true); // 設定視窗可見
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉操作
    }
}
