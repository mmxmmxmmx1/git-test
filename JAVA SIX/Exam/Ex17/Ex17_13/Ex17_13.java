//Ex17_13 , 更多類型的原件
package Exam.Ex17.Ex17_13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex17_13 {
    // RollBar 類別繼承自 JFrame 並實現 AdjustmentListener 接口
    public static class RollBar extends JFrame implements AdjustmentListener {
        // 垂直和水平滾動條
        static JScrollBar scr = new JScrollBar(JScrollBar.VERTICAL);
        static JScrollBar scr1 = new JScrollBar(JScrollBar.HORIZONTAL);

        // 用於顯示滾動條位置的標籤
        static JLabel lab = new JLabel("ScrollBar at(0.0)", JLabel.LEFT);

        // 構造函數，設定窗口屬性和組件
        public RollBar() {
            setTitle("JScrollerBar"); // 設定窗口標題
            setSize(350, 200); // 設定窗口大小
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 關閉窗口時退出程式
            setLayout(new BorderLayout()); // 設定佈局為邊界佈局

            // 設定滾動條的最大值
            scr.setMaximum(1000);
            scr1.setMaximum(1000);

            // 將滾動條和標籤添加到窗口的指定位置
            add(scr, BorderLayout.EAST); // 垂直滾動條放在東邊
            add(scr1, BorderLayout.SOUTH); // 水平滾動條放在南邊
            add(lab, BorderLayout.CENTER); // 標籤放在中間

            // 為滾動條添加調整事件監聽器
            scr.addAdjustmentListener(this);
            scr1.addAdjustmentListener(this);

            setVisible(true); // 顯示窗口
        }

        // 處理滾動條值變化的事件
        public void adjustmentValueChanged(AdjustmentEvent e) {
            // 更新標籤文本，顯示當前滾動條的值
            lab.setText("ScrollBar at (" + scr.getValue() + "." + scr1.getValue() + ")");
        }
    }

    // 主方法，程式入口
    public static void main(String[] args) {
        new RollBar(); // 創建 RollBar 實例，啟動應用
    }
}
