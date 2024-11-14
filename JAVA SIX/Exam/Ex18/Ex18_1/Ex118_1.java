//EX18_1 , 網址與InetAddress類別的使用
package Exam.Ex18.Ex18_1;

import java.awt.*; // 引入 AWT（Abstract Window Toolkit）包
import java.awt.event.*; // 引入 AWT 事件處理包
import java.net.InetAddress; // 引入 InetAddress 類，用於獲取主機資訊
import java.net.UnknownHostException; // 引入 UnknownHostException 異常處理
import javax.swing.*; // 引入 Swing 包，用於建立 GUI 元件

public class Ex118_1 {
    public static void main(String[] args) {
        // 創建主框架，標題為 "InetAddress class"
        JFrame frm = new JFrame("InetAddress class");
        
        // 創建一個面板，使用 FlowLayout 佈局管理器
        JPanel pne = new JPanel(new FlowLayout());

        // 創建兩個按鈕，分別用於顯示主機名稱和主機地址
        JButton nameBtn = new JButton("Host name");
        JButton addressBtn = new JButton("Host Address");

        // 設定按鈕的首選大小
        nameBtn.setPreferredSize(new Dimension(130, 40));
        addressBtn.setPreferredSize(new Dimension(130, 40));

        // 將按鈕添加到面板中
        pne.add(nameBtn);
        pne.add(addressBtn);

        // 創建第二個面板，使用居中對齊的 FlowLayout
        JPanel pne2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // 創建一個標籤，初始文字為 "InetAddress class"
        JLabel lab = new JLabel("InetAddress class");
        
        // 將標籤添加到第二個面板中
        pne2.add(lab);

        // 創建一個動作監聽器，處理按鈕點擊事件
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 獲取本地主機的 InetAddress 實例
                    InetAddress adr = InetAddress.getLocalHost();
                    
                    // 判斷是點擊了哪一個按鈕
                    if (e.getSource() == nameBtn) {
                        // 獲取主機名稱並設置到標籤上
                        String host = adr.getHostName();
                        lab.setText(host);
                    } else if (e.getSource() == addressBtn) {
                        // 獲取主機地址並設置到標籤上
                        String address = adr.getHostAddress();
                        lab.setText(address);
                    }
                } catch (UnknownHostException ex) {
                    // 如果無法獲取主機資訊，設置錯誤訊息到標籤上
                    lab.setText("無法取得主機訊息");
                }
            }
        };
        
        // 為兩個按鈕添加動作監聽器
        nameBtn.addActionListener(actLis);
        addressBtn.addActionListener(actLis);
        
        // 將第一個面板添加到主框架的北部（上方）
        frm.add(pne, BorderLayout.NORTH);
        
        // 將第二個面板添加到主框架的中央
        frm.add(pne2, BorderLayout.CENTER);
        
        // 設定主框架的大小為 400x200 像素
        frm.setSize(400, 200);
        
        // 設定主框架為可見
        frm.setVisible(true);
        
        // 設定關閉主框架時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
