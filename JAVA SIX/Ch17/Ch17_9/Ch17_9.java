//Ch17_9, Jbutton與JLabel的綜合應用
/*書上的原本程式碼按下前一張是沒有任何反應的，因為原始程式碼只有
----------------------------------------------------------------
if(btn==btn1 && index<0)
index -- 
----------------------------------------------------------------
造成根本不會翻到下一張圖片，增加新的程式碼後才能翻到下一張圖片 */
package Ch17.Ch17_9;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch17_9 {
    static JFrame frm = new JFrame("JButton & JLabel");
    static JPanel pne = new JPanel();

    static ImageIcon pic[] = new ImageIcon[4]; // 建立ImageIcon陣列
    static ImageIcon lefe = new ImageIcon("Ch17/Ch17_9/left.png");
    static ImageIcon right = new ImageIcon("Ch17/Ch17_9/right.png");

    static JButton btn1 = new JButton("前一張", lefe);
    static JButton btn2 = new JButton("後一張", right);
    static JLabel lab = new JLabel();
    static int index = 0; // index變數,用來紀錄哪一張影像鄭被顯示

    public static void main(String[] args) {
        pic[0] = new ImageIcon("Ch17/Ch17_9/pic0.png");
        pic[1] = new ImageIcon("Ch17/Ch17_9/pic1.png");
        pic[2] = new ImageIcon("Ch17/Ch17_9/pic2.png");
        pic[3] = new ImageIcon("Ch17/Ch17_9/pic3.png");
        // 設定文字水平位置
        btn2.setHorizontalTextPosition(JButton.LEFT);
        pne.add(btn1);
        pne.add(btn2);
        pne.add(lab);
        frm.add(pne);
        lab.setIcon(pic[0]);
        lab.setText("pic0.png");
        // 設定文字水平位置
        lab.setHorizontalTextPosition(JLabel.CENTER);
        // 設定文字垂直位置
        lab.setVerticalTextPosition(JLabel.BOTTOM);

        btn1.addActionListener(new ActLis());
        btn2.addActionListener(new ActLis());

        frm.setSize(400, 300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource(); // 取得被按下的按鈕
            int num = pic.length;

            if (btn == btn1 && index > 0) {// 若btn1被按下，且index>0
                index--;
                lab.setText("pic" + index + ".png"); // 更新標題名稱
                lab.setIcon(pic[index % num]); // 更新顯示圖片
            }
            if (btn == btn2 && index < num - 1) { // 若btn2被按下，且index<num-1
                index++;
                lab.setText("pic" + index % num + ".png"); // 設定標題名稱
                lab.setIcon(pic[index % num]);// 設定顯示圖片
            }
        }
    }
}
