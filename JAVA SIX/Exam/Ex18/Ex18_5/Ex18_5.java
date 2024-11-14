//Ex18_5 , 認識URL
package Exam.Ex18.Ex18_5;

import java.awt.*; // 匯入 GUI 元件所需的庫
import java.awt.event.*; // 匯入事件處理的庫
import java.io.IOException; // 匯入用於處理輸入/輸出異常的庫
import java.net.URL; // 匯入 URL 類別，用於處理網址
import java.net.URLConnection; // 匯入 URLConnection 類別，用於處理 URL 連線
import javax.swing.*; // 匯入 Swing 元件，用於 GUI 建構

public class Ex18_5 {
    public static void main(String[] args) {
        // 建立標題為 "URL info" 的 JFrame 作為主應用程式視窗
        JFrame frm = new JFrame("URL info");
        
        // 設定主要面板，使用 BorderLayout 佈局
        JPanel pne = new JPanel(new BorderLayout());
        
        // 建立一個用於輸入 URL 的 JTextField，設定預設文字和尺寸
        JTextField txf = new JTextField("pchome.com.tw");
        txf.setPreferredSize(new Dimension(25, 25)); // 設定文字欄位尺寸
        
        // 為主要面板加上邊框間距
        pne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 10));

        // 用於放置 JTextArea 的面板，顯示連線資訊
        JPanel pne1 = new JPanel();
        
        // 建立不可編輯的 JTextArea，用於顯示 URL 的連線資訊
        JTextArea txa = new JTextArea();
        txa.setEditable(false); // 設定 JTextArea 為不可編輯
        txa.setPreferredSize(new Dimension(280, 110)); // 設定 JTextArea 尺寸

        // 用於放置按鈕的面板，位於 GUI 底部
        JPanel pne2 = new JPanel();
        
        // 建立一個標籤為 "open connection" 的按鈕
        JButton checkBtn = new JButton("open connection");
        checkBtn.setPreferredSize(new Dimension(150, 25)); // 設定按鈕尺寸
        pne2.add(checkBtn); // 將按鈕加入面板

        // 為按鈕設置事件監聽器，用於處理 URL 連線過程
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 取得 JTextField 的文字並去除多餘的空白
                String urlText = txf.getText().trim();
                
                // 檢查 URL 是否以 "http://" 或 "https://" 開頭，若無則加上 "http://"
                if (!urlText.startsWith("http://") && !urlText.startsWith("https://")) {
                    urlText = "http://www." + urlText;
                    try {
                        // 清除 JTextArea 的內容，準備顯示新資訊
                        txa.setText("");
                        
                        // 建立 URL 物件並打開連線
                        URL u = new URL(urlText);
                        URLConnection uc = u.openConnection();
                        
                        // 在 JTextArea 中顯示主網頁的內容大小及類型
                        txa.append("主網頁大小為" + uc.getContentLength() + "\n" + "類型為" + uc.getContentType());
                    } catch (IOException ex) {
                        // 若發生 IOException，則顯示錯誤訊息
                        ex.getMessage();
                    }
                }
            }
        };
        // 將事件監聽器加入按鈕
        checkBtn.addActionListener(actLis);
        
        // 將 JTextField 加入頂部面板 (位於主面板的北區)
        pne.add(txf);
        
        // 將 JTextArea 加入中間面板 (位於主面板的中間區域)
        pne1.add(txa);
        
        // 將按鈕面板加入底部 (JFrame 的南區)
        frm.add(pne, BorderLayout.NORTH);
        frm.add(pne1, BorderLayout.CENTER);
        frm.add(pne2, BorderLayout.SOUTH);
        
        // 設定 JFrame 的大小、可見性及關閉操作
        frm.setSize(320, 220);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
