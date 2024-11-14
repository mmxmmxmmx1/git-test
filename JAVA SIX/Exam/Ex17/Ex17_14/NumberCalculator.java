//可以完整執行的程式碼，Claude 寫出來的
//切分成多個方法
package Exam.Ex17.Ex17_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberCalculator extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JRadioButton absButton, squareButton, cubeButton;
    private ButtonGroup buttonGroup;
    private JButton calculateButton;

    public NumberCalculator() {
        setTitle("Number Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 創建上方的單選按鈕面板
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        absButton = new JRadioButton("絕對值");
        squareButton = new JRadioButton("平方值");
        cubeButton = new JRadioButton("立方值");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(absButton);
        buttonGroup.add(squareButton);
        buttonGroup.add(cubeButton);
        absButton.setSelected(true);

        radioPanel.add(absButton);
        radioPanel.add(squareButton);
        radioPanel.add(cubeButton);

        // 創建輸入區域的面板
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel xLabel = new JLabel("x=");
        inputField = new JTextField(10);
        calculateButton = new JButton("計算");

        inputPanel.add(xLabel);
        inputPanel.add(inputField);
        inputPanel.add(calculateButton);

        // 創建結果面板
        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultLabel = new JLabel("");
        resultPanel.add(resultLabel);

        // 創建一個主面板來包含所有元件，改為使用 FlowLayout
        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        mainPanel.add(radioPanel);
        mainPanel.add(inputPanel);
        mainPanel.add(resultPanel);

        // 將主面板加入到框架
        add(mainPanel, BorderLayout.CENTER);

        // 設定計算按鈕的事件處理
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        // 設定視窗大小和位置
        setSize(500, 200);
        setLocationRelativeTo(null);
    }

    private void calculate() {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            String operation = "";

            if (absButton.isSelected()) {
                result = Math.abs(input);
                operation = "abs";
            } else if (squareButton.isSelected()) {
                result = Math.pow(input, 2);
                operation = "square";
            } else if (cubeButton.isSelected()) {
                result = Math.pow(input, 3);
                operation = "cube";
            }

            resultLabel.setText(operation + "(" + input + ") = " + result);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "請輸入有效的數字！", "錯誤", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberCalculator().setVisible(true);
            }
        });
    }
}
