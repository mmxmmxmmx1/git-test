// 範例 Ex18_4，展示如何使用 URL 和 URLConnection 類別來讀取本地資源 ("poem.txt")
// 並顯示在 Swing GUI 的 JTextArea 中

package Exam.Ex18.Ex18_4;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.*;

public class Ex18_4 {
    public static void main(String[] args) {
        // 創建一個 JFrame 作為應用程序的主窗口
        JFrame frm = new JFrame("URL");
        JPanel pne = new JPanel(); // 創建一個 JPanel 容器來包含 UI 元素

        // 創建 JTextArea 顯示從 URL 讀取的內容
        JTextArea txa = new JTextArea("", 8, 15);
        txa.setLineWrap(true); // 設定自動換行
        txa.setWrapStyleWord(true); // 設定換行的時候不截斷單詞
        txa.setEditable(false); // 設置為不可編輯，只能顯示內容

        // 創建 JButton 以觸發顯示文本檔案的動作
        JButton showBtn = new JButton("Show");
        showBtn.setPreferredSize(new Dimension(80, 25)); // 設置按鈕大小

        // 創建 ActionListener 以處理按鈕點擊事件
        ActionListener actLis = new ActionListener() {
            String str; // 儲存從文件中讀取的每一行

            public void actionPerformed(ActionEvent e) {
                try {
                    // 使用 getResource() 方法來找到 "poem.txt" 文件的 URL
                    URL u = Ex18_4.class.getResource("poem.txt");
                    
                    // 獲取 URL 的連接對象
                    URLConnection uc = u.openConnection();
                    
                    // 讀取文件內容
                    Object obj = u.getContent();
                    InputStreamReader isr = new InputStreamReader((InputStream) obj);
                    BufferedReader br = new BufferedReader(isr);

                    // 顯示文件的大小
                    txa.append("File size=" + uc.getContentLength() + " bytes\n");
                    
                    // 從文件中逐行讀取並顯示內容
                    while ((str = br.readLine()) != null) {
                        txa.append(str + "\n");
                    }
                } catch (IOException ex) {
                    // 如果發生 IO 異常，顯示異常訊息
                    txa.setText(ex.getMessage());
                } catch (NullPointerException ex) {
                    // 如果發生空指針異常，顯示異常訊息
                    txa.setText(ex.getMessage());
                }
            }
        };
        // 將事件處理器綁定到按鈕上
        showBtn.addActionListener(actLis);
        
        // 將 JTextArea 和 JButton 添加到 JPanel 中
        pne.add(txa);
        pne.add(showBtn);
        
        // 設置 JFrame 的內容和屬性
        frm.add(pne);
        frm.setSize(300, 230); // 設置窗口大小
        frm.setVisible(true); // 使窗口可見
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設置默認關閉操作
    }
}
