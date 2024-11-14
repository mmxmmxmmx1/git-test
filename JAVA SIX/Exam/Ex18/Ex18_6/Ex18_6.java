// Ex18_6 - 認識 URL
package Exam.Ex18.Ex18_6;

import java.awt.*; // 匯入 GUI 元件所需的庫
import java.awt.event.*; // 匯入事件處理的庫
import java.io.IOException; // 匯入處理輸入/輸出異常的庫
import java.net.URL; // 匯入 URL 類別，用於處理網址
import java.net.URLConnection; // 匯入 URLConnection 類別，用於處理 URL 連線
import javax.swing.*; // 匯入 Swing 元件，用於建構 GUI

public class Ex18_6 {
    public static void main(String[] args) {
        // 建立標題為 "URL info" 的主視窗 JFrame
        JFrame frm = new JFrame("URL info");

        // 設定主要面板，使用 BorderLayout 佈局
        JPanel pne = new JPanel(new BorderLayout());

        // 建立輸入 URL 的文字欄位，預設值為 "pchome.com.tw"
        JTextField txf = new JTextField("pchome.com.tw");
        txf.setPreferredSize(new Dimension(25, 25)); // 設定文字欄位尺寸

        // 為主要面板設定邊距
        pne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 10));

        // 建立用於顯示連線資訊的文字區域
        JPanel pne1 = new JPanel();
        JTextArea txa = new JTextArea();
        txa.setEditable(false); // 設定文字區域為不可編輯
        txa.setPreferredSize(new Dimension(280, 120)); // 設定文字區域尺寸

        // 建立底部面板，放置按鈕
        JPanel pne2 = new JPanel();
        JButton checkBtn = new JButton("open connection");
        checkBtn.setPreferredSize(new Dimension(150, 25)); // 設定按鈕尺寸
        pne2.add(checkBtn); // 將按鈕加入面板

        // 建立按鈕的事件監聽器
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 取得輸入的 URL 文字，並去除前後空白
                String urlText = txf.getText().trim();

                // 檢查 URL 是否以 "http://" 或 "https://" 開頭，若否則加上 "http://www."
                if (!urlText.startsWith("http://") && !urlText.startsWith("https://")) {
                    urlText = "http://www." + urlText;
                    try {
                        // 清空文字區域的內容
                        txa.setText("");

                        // 建立主網頁的 URL 物件
                        URL u = new URL(urlText);

                        // 取得資源檔案的 URL（相對於當前類別位置）
                        URL u1 = Ex18_6.class.getResource("poem.txt");
                        URL u2 = Ex18_6.class.getResource("pic0.png");

                        // 開啟 URL 連線
                        URLConnection uc = u.openConnection();
                        URLConnection uc1 = u1.openConnection();
                        URLConnection uc2 = u2.openConnection();

                        // 使用 StringBuffer 來構建輸出字串
                        StringBuffer word = new StringBuffer();
                        word.append(String.format("主網頁大小為%d ,類型為%s%n ", uc.getContentLength(), uc.getContentType()))
                                .append(String.format("poem.txt的大小為%d ,類型為%s%n", uc1.getContentLength(),
                                        uc1.getContentType()))
                                .append(String.format("pic0.png的大小為%d ,類型為%s", uc2.getContentLength(),
                                        uc2.getContentType()));

                        // 將結果顯示在文字區域中
                        txa.setText(word.toString());
                    } catch (IOException ex) {
                        // 若發生異常，顯示錯誤訊息
                        txa.setText("發生錯誤：" + ex.getMessage());
                    }
                }
            }
        };
        // 將事件監聽器加入按鈕
        checkBtn.addActionListener(actLis);

        // 將文字欄位加入頂部面板
        pne.add(txf);

        // 將文字區域加入中間面板
        pne1.add(txa);

        // 將按鈕面板加入底部
        frm.add(pne, BorderLayout.NORTH);
        frm.add(pne1, BorderLayout.CENTER);
        frm.add(pne2, BorderLayout.SOUTH);

        // 設定主視窗的尺寸、可見性和關閉操作
        frm.setSize(320, 220);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
