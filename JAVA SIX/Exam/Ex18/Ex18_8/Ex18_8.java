//Ex18_8 , 建立主從架構程式 -- 使用Socket類別
package Exam.Ex18.Ex18_8;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

public class Ex18_8 {
    public static void main(String[] args) {
        // 創建伺服器視窗 (JFrame)
        JFrame frm = new JFrame("伺服器");
        byte serverbuff[] = new byte[1024]; // 用於存儲伺服器接收的資料緩衝區
        JPanel serverPne = new JPanel(new BorderLayout()); // 伺服器的主面板
        serverPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 伺服器的訊息顯示區
        JTextArea txa = new JTextArea("", 8, 8);
        txa.setEditable(false); // 設定訊息區為不可編輯

        // 伺服器按鈕區
        JPanel serverPne1 = new JPanel(new FlowLayout());
        JButton connBtn = new JButton("連線");
        connBtn.setPreferredSize(new Dimension(85, 35));

        // 伺服器按鈕的事件監聽器
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 新增一個執行緒來處理伺服器的連線與通訊
                new Thread(() -> {
                    try {
                        ServerSocket svs = new ServerSocket(8080); // 開啟伺服器端的 ServerSocket
                        SwingUtilities.invokeLater(() -> txa.append("等候客戶端的請求中...\n"));

                        Socket s = svs.accept(); // 等待客戶端連線
                        SwingUtilities.invokeLater(() -> txa.append("客戶端已和本機連上線...\n"));
                        OutputStream out = s.getOutputStream(); // 用於傳送資料到客戶端
                        String str = "No pain, no gain."; // 要傳送的字串
                        SwingUtilities.invokeLater(() -> txa.append("資料正在傳送中...\n"));
                        out.write(str.getBytes()); // 傳送字串
                        SwingUtilities.invokeLater(() -> txa.append("已傳送字串..." + str + "\n"));
                        out.flush(); // 強制將資料寫出

                        InputStream in = s.getInputStream(); // 用於接收客戶端回傳的資料
                        int n = in.read(serverbuff); // 讀取資料到緩衝區
                        SwingUtilities.invokeLater(() -> txa.append("已接收回報..." + new String(serverbuff, 0, n) + "\n"));
                        svs.close(); // 關閉伺服器連線
                        out.close(); // 關閉輸出流
                        s.close(); // 關閉 Socket
                        SwingUtilities.invokeLater(() -> txa.append("資料傳送完畢...\n"));
                    } catch (IOException ex) {
                        SwingUtilities.invokeLater(() -> txa.append("發生了" + ex + "例外\n")); // 當發生 IO 例外時顯示錯誤
                    }
                }).start();
            }
        };
        connBtn.addActionListener(actLis); // 設定按鈕的事件監聽器
        serverPne.add(txa); // 將訊息顯示區添加到主面板
        serverPne1.add(connBtn); // 將按鈕添加到按鈕區
        frm.add(serverPne, BorderLayout.NORTH); // 將伺服器主面板添加到視窗
        frm.add(serverPne1, BorderLayout.SOUTH); // 將伺服器按鈕區添加到視窗
        frm.setSize(320, 240);
        frm.setVisible(true);
        frm.setLocation(50, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉操作

        // 創建客戶端視窗 (JFrame)
        JFrame frm1 = new JFrame("客戶端");
        byte clientbuff[] = new byte[1024]; // 用於存儲客戶端接收的資料緩衝區
        JPanel clientPne = new JPanel(new BorderLayout()); // 客戶端的主面板
        clientPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 客戶端的訊息顯示區
        JTextArea txa1 = new JTextArea("", 8, 8);
        txa1.setEditable(false);

        // 客戶端按鈕區
        JPanel clientPne1 = new JPanel(new FlowLayout());
        JButton connBtn1 = new JButton("連線");
        connBtn1.setPreferredSize(new Dimension(85, 35));

        // 客戶端按鈕的事件監聽器
        ActionListener actLis1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 新增一個執行緒來處理客戶端的連線與通訊
                new Thread(() -> {
                    try {
                        txa1.setText("");
                        SwingUtilities.invokeLater(() -> txa1.append("正在與伺服器建立連線....\n"));
                        Socket s = new Socket("127.0.0.1", 8080); // 連接到本地伺服器
                        SwingUtilities.invokeLater(() -> txa1.append("已經與伺服器取得連線.....\n"));

                        InputStream in = s.getInputStream(); // 用於接收伺服器端傳送的資料
                        int n = in.read(clientbuff); // 讀取資料到緩衝區
                        SwingUtilities.invokeLater(() -> txa1.append("從伺服器端收到："));
                        SwingUtilities.invokeLater(() -> txa1.append(new String(clientbuff, 0, n) + "\n"));

                        OutputStream out = s.getOutputStream(); // 用於回傳資料到伺服器
                        String str = "received"; // 回傳的字串
                        out.write(str.getBytes()); // 傳送回報
                        SwingUtilities.invokeLater(() -> txa1.append("已回報到伺服器...." + str));
                        out.flush(); // 強制將資料寫出
                        in.close(); // 關閉輸入流
                        s.close(); // 關閉 Socket
                    } catch (Exception ex) {
                        SwingUtilities.invokeLater(() -> txa1.append("發生了" + ex + "例外\n")); // 當發生 IO 例外時顯示錯誤
                    }
                }).start();
            }
        };

        connBtn1.addActionListener(actLis1); // 設定按鈕的事件監聽器
        clientPne.add(txa1); // 將訊息顯示區添加到主面板
        clientPne1.add(connBtn1); // 將按鈕添加到按鈕區
        frm1.add(clientPne, BorderLayout.NORTH); // 將客戶端主面板添加到視窗
        frm1.add(clientPne1, BorderLayout.SOUTH); // 將客戶端按鈕區添加到視窗
        frm1.setSize(320, 240);
        frm1.setVisible(true);
        frm1.setLocation(400, 100);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉操作
    }
}
