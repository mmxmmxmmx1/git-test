// Ex18_3， 使用 URL 和 InetAddress 類別
package Exam.Ex18.Ex18_3;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.*;

public class Ex18_3 {
    public static void main(String[] args) {
        // 建立 JFrame 視窗
        JFrame frm = new JFrame("URL");
        
        // 建立 JPanel 作為主要的容器
        JPanel pne = new JPanel();
        
        // 建立 JTextArea，設定大小為 8 行 x 15 列
        JTextArea txa = new JTextArea("", 8, 15);
        txa.setLineWrap(true); // 設定自動換行
        txa.setWrapStyleWord(true); // 設定換行時以單詞為單位
        txa.setEditable(false); // 設定不可編輯

        // 建立 Show 按鈕，並設定大小
        JButton showBtn = new JButton("Show");
        showBtn.setPreferredSize(new Dimension(80, 25));

        // 設定按鈕的點擊事件
        ActionListener actLis = new ActionListener() {
            String str; // 用來存儲從檔案中讀取的每行文字

            public void actionPerformed(ActionEvent e) {
                try {
                    // 使用 getResource 方法獲取 poem.txt 的 URL
                    URL u = Ex18_3.class.getResource("poem.txt");
                    
                    // 獲取 URL 的內容（通常是 InputStream）
                    Object obj = u.getContent();
                    InputStreamReader isr = new InputStreamReader((InputStream) obj);
                    BufferedReader br = new BufferedReader(isr);

                    // 逐行讀取檔案內容，並添加到 JTextArea 中
                    while ((str = br.readLine()) != null) {
                        txa.append(str + "\n"); // 每行後面加上換行符號
                    }
                } catch (IOException ex) {
                    // 如果發生 IO 異常，顯示錯誤訊息
                    txa.setText(ex.getMessage());
                } catch (NullPointerException ex) {
                    // 如果發生 NullPointerException，顯示錯誤訊息
                    txa.setText(ex.getMessage());
                }
            }
        };
        
        // 將 ActionListener 添加到 Show 按鈕上
        showBtn.addActionListener(actLis);
        
        // 將 JTextArea 和 Show 按鈕添加到 JPanel 中
        pne.add(txa);
        pne.add(showBtn);
        
        // 將 JPanel 添加到 JFrame 中
        frm.add(pne);
        
        // 設定 JFrame 的大小
        frm.setSize(300, 230);
        
        // 設定 JFrame 可見
        frm.setVisible(true);
        
        // 設定當關閉視窗時結束程式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
