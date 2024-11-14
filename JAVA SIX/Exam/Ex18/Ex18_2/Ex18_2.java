// Ex18_2， 使用 URL 和 InetAddress 類別
package Exam.Ex18.Ex18_2;

import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Ex18_2 {
    public static void main(String[] args) {
        // 創建主視窗，標題為 "InetAddress class"
        JFrame frm = new JFrame("InetAddress class");

        // 創建主面板，使用垂直盒布局
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // 創建第一個子面板，使用 BorderLayout（此處未使用，保留以備未來擴展）
        JPanel pne = new JPanel(new BorderLayout());

        // 創建輸入網址的文字欄位，初始為空白
        JTextField txf = new JTextField("yahoo.com.tw");
        // 設定文字欄位的首選高度為25像素，寬度自適應
        txf.setPreferredSize(new Dimension(0, 25));
        // 將文字欄位加入主面板
        mainPanel.add(txf);

        // 創建第二個子面板，使用 BorderLayout（此處未使用，保留以備未來擴展）
        JPanel pne2 = new JPanel(new BorderLayout());

        // 創建用於顯示結果的文字欄位，初始為空白
        JTextField txf1 = new JTextField("");
        // 設定結果欄位為不可編輯，以防使用者修改
        txf1.setEditable(false);
        // 設定結果欄位的首選高度為25像素，寬度自適應
        txf1.setPreferredSize(new Dimension(0, 25));
        // 將結果欄位加入主面板
        mainPanel.add(txf1);

        // 創建第三個子面板，使用居中對齊的流式佈局
        JPanel pne3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // 創建 "查詢" 按鈕
        JButton checkBtn = new JButton("查詢");
        // 設定按鈕的首選尺寸為70x25像素
        checkBtn.setPreferredSize(new Dimension(70, 25));
        // 將按鈕加入第三個子面板
        pne3.add(checkBtn);

        // 定義按鈕的動作監聽器
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 獲取使用者輸入的網址，並去除首尾空白
                String urlText = txf.getText().trim();

                // 檢查網址是否以 "http://" 或 "https://" 開頭，若否則自動補全 "http://www."
                if (!urlText.startsWith("http://") && !urlText.startsWith("https://")) {
                    urlText = "http://www." + urlText;
                }
                try {
                    // 使用補全後的網址創建 URL 物件
                    URL u = new URL(urlText);
                    // 取得主機名稱並解析其 IP 地址
                    InetAddress adr = InetAddress.getByName(u.getHost());

                    // 在結果欄位顯示主機名稱和其 IP 地址
                    txf1.setText(u.getHost() + " / " + adr.getHostAddress());
                } catch (MalformedURLException ex) {
                    // 若網址格式錯誤，顯示錯誤訊息
                    txf1.setText("查詢錯誤: 格式不正確");
                } catch (Exception ex) {
                    // 捕捉其他可能的例外，顯示錯誤訊息
                    txf1.setText("查詢錯誤: " + ex.getMessage());
                }
            }
        };
        // 將動作監聽器綁定到 "查詢" 按鈕
        checkBtn.addActionListener(actLis);

        // 將各子面板及間隔加入主面板
        mainPanel.add(pne);
        // 添加垂直間隔，寬度為0，高度為3像素
        mainPanel.add(Box.createRigidArea(new Dimension(0, 3)));
        mainPanel.add(pne2);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 3)));
        mainPanel.add(pne3);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 3)));

        // 將主面板加入主視窗的北部
        frm.add(mainPanel, BorderLayout.NORTH);
        // 設定主視窗的尺寸為350x150像素
        frm.setSize(350, 150);
        // 設定主視窗為可見
        frm.setVisible(true);
        // 設定關閉主視窗時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
