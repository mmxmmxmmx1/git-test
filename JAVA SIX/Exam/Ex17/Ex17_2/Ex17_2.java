//Ex17_2 ， 使用Swing 物件
package Exam.Ex17.Ex17_2;

import javax.swing.*; // 導入Swing組件
import java.awt.*; // 導入AWT組件,用於顏色和字體

public class Ex17_2 {
    // 創建JFrame對象,設置標題為"My Frame"
    static JFrame frm = new JFrame("My Frame");
    // 創建JLabel對象,設置文本為"Knowledge is power"
    static JLabel lab = new JLabel("Knowledge is power");

    public static void main(String[] args) {
        // 設置JFrame內容面板的背景顏色為粉紅色
        frm.getContentPane().setBackground(Color.PINK);

        lab.setBackground(Color.PINK); // 設置JLabel的背景顏色為粉紅色
        lab.setForeground(Color.BLUE); // 設置JLabel的文字顏色為藍色
        lab.setFont(new Font("Arial", Font.PLAIN, 14)); // 設置JLabel的字體為Arial,普通樣式,14號大小

        frm.setSize(250, 120); // 設置JFrame的大小為250x120像素
        frm.setLayout(null); // 設置JFrame為絕對佈局(無佈局管理器)

        lab.setBounds(40, 0, 160, 20); // 設置JLabel的位置(x=40,y=0)和大小(寬160,高20)
        lab.setOpaque(true); // 設置JLabel為不透明,確保背景顏色可見

        frm.add(lab); // 將JLabel添加到JFrame中

        frm.setVisible(true); // 設置JFrame為可見
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設置關閉窗口時終止程序
    }
}