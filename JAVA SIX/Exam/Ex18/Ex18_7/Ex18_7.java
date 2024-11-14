//Ex18_7 , 建立主從架構程式 -- 使用Socket類別
package Exam.Ex18.Ex18_7;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

// 主類別 Ex18_7，包含主方法，啟動伺服器和客戶端
public class Ex18_7 {
    public static void main(String[] args) {
        // 建立伺服器視窗
        JFrame frm = new JFrame("Server");
        JPanel serverPne = new JPanel(new BorderLayout());
        serverPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // 設置邊框

        JTextArea txa = new JTextArea("", 8, 8); // 創建文字區域顯示訊息
        txa.setEditable(false); // 設為不可編輯

        JPanel serverPne1 = new JPanel(new FlowLayout());
        JButton connBtn = new JButton("連線"); // 創建伺服器的連線按鈕
        connBtn.setPreferredSize(new Dimension(85, 35)); // 設定按鈕大小

        // 伺服器按鈕的事件監聽器
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 使用新執行緒處理連線以避免阻塞 GUI
                new Thread(() -> {
                    try {
                        ServerSocket svs = new ServerSocket(2525); // 創建 ServerSocket 監聽端口 2525
                        SwingUtilities.invokeLater(() -> txa.append("等候客戶端的請求中...\n"));

                        Socket s = svs.accept(); // 接受客戶端連線，這會阻塞直到有連線
                        SwingUtilities.invokeLater(() -> txa.append("客戶端已和本機連上線...\n"));

                        OutputStream out = s.getOutputStream(); // 取得客戶端的輸出流
                        String str = "Honor shows the man.";
                        SwingUtilities.invokeLater(() -> txa.append("資料正在傳送中...\n"));
                        out.write(str.getBytes()); // 傳送字串資料到客戶端
                        out.flush();
                        out.close(); // 關閉輸出流
                        s.close(); // 關閉連線
                        svs.close(); // 關閉 ServerSocket
                        SwingUtilities.invokeLater(() -> txa.append("資料傳送完畢...\n"));
                    } catch (IOException ex) {
                        SwingUtilities.invokeLater(() -> txa.append("發生了" + ex + "例外\n"));
                    }
                }).start(); // 開始執行緒
            }
        };
        connBtn.addActionListener(actLis); // 將事件監聽器添加到伺服器按鈕
        serverPne.add(txa); // 將文字區域添加到伺服器面板
        serverPne1.add(connBtn); // 將按鈕添加到伺服器面板
        frm.add(serverPne, BorderLayout.NORTH);
        frm.add(serverPne1, BorderLayout.SOUTH);
        frm.setSize(320, 240); // 設定伺服器視窗大小
        frm.setVisible(true); // 顯示伺服器視窗
        frm.setLocation(50, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉操作

        // 建立客戶端視窗
        JFrame frm1 = new JFrame("Client");
        byte clientbuff[] = new byte[1024]; // 緩衝區，用於接收資料
        JPanel clientPne = new JPanel(new BorderLayout());
        clientPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JTextArea txa1 = new JTextArea("", 8, 8); // 客戶端的文字區域
        txa1.setEditable(false);

        JPanel clientPne1 = new JPanel(new FlowLayout());
        JButton connBtn1 = new JButton("連線"); // 創建客戶端的連線按鈕
        connBtn1.setPreferredSize(new Dimension(85, 35));

        // 客戶端按鈕的事件監聽器
        ActionListener actLis1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Thread(() -> {
                    try {
                        txa1.setText(""); // 清空客戶端的文字區域
                        SwingUtilities.invokeLater(() -> txa1.append("正在與伺服器建立連線....\n"));
                        Socket s = new Socket("127.0.0.1", 2525); // 連接到伺服器 (本機端口 2525)
                        SwingUtilities.invokeLater(() -> txa1.append("已經與伺服器取得連線.....\n"));

                        InputStream in = s.getInputStream(); // 取得伺服器的輸入流
                        int n = in.read(clientbuff); // 從伺服器接收資料
                        SwingUtilities.invokeLater(() -> txa1.append("從伺服器端收到：\n"));
                        SwingUtilities.invokeLater(() -> txa1.append(new String(clientbuff, 0, n) + "\n")); // 顯示接收到的資料
                        in.close(); // 關閉輸入流
                        s.close(); // 關閉連線
                    } catch (Exception ex) {
                        ex.getMessage(); // 異常處理
                    }
                }).start(); // 開始執行緒
            }
        };
        connBtn1.addActionListener(actLis1); // 將事件監聽器添加到客戶端按鈕
        clientPne.add(txa1); // 將文字區域添加到客戶端面板
        clientPne1.add(connBtn1); // 將按鈕添加到客戶端面板
        frm1.add(clientPne, BorderLayout.NORTH);
        frm1.add(clientPne1, BorderLayout.SOUTH);
        frm1.setSize(320, 240); // 設定客戶端視窗大小
        frm1.setVisible(true); // 顯示客戶端視窗
        frm1.setLocation(400, 100);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉操作
    }
}
