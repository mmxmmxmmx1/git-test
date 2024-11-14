//Ex18_8 , 建立主從架構程式 -- 使用Socket類別
package Exam.Ex18.Ex18_9;

// 匯入必要的 Java 函式庫
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

public class Ex18_9 {
    public static void main(String[] args) {
        // 建立伺服器端的 GUI 視窗
        JFrame frm = new JFrame("伺服端");
        byte serverbuff[] = new byte[1024]; // 伺服器用來讀取資料的緩衝區

        // 建立一個 BorderLayout 佈局的面板給伺服器
        JPanel serverPne = new JPanel(new BorderLayout());
        serverPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 建立不可編輯的文字區域來顯示訊息
        JTextArea txa = new JTextArea("", 8, 8);
        txa.setEditable(false);

        // 建立一個 FlowLayout 佈局的面板和一個連線按鈕
        JPanel serverPne1 = new JPanel(new FlowLayout());
        JButton connBtn = new JButton("連線");
        connBtn.setPreferredSize(new Dimension(85, 35));

        // 定義連線按鈕的動作監聽器
        ActionListener actLis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 開啟一個新執行緒來處理伺服器操作
                new Thread(() -> {
                    try {
                        // 在埠號 8080 建立伺服器端的 Socket
                        ServerSocket svs = new ServerSocket(8080);
                        SwingUtilities.invokeLater(() -> txa.append("等候客戶端的請求中...\n"));

                        // 接受客戶端的連線
                        Socket s = svs.accept();
                        SwingUtilities.invokeLater(() -> txa.append("客戶端已和本機連上線...\n"));

                        // 從客戶端取得輸入流
                        InputStream in = s.getInputStream();
                        int n = in.read(serverbuff); // 將資料讀入緩衝區
                        SwingUtilities.invokeLater(() -> txa.append("從客戶端收到: " + new String(serverbuff, 0, n) + "\n"));

                        // 將收到的資料轉換為字串
                        String str = new String(serverbuff, 0, n);

                        // 取得輸出流以傳送資料回客戶端
                        OutputStream out = s.getOutputStream();
                        out.write(str.getBytes()); // 將收到的資料回傳給客戶端
                        SwingUtilities.invokeLater(() -> txa.append("傳回" + str + "到客戶端\n"));

                        out.flush(); // 清空輸出流

                        // 關閉資源
                        svs.close();
                        out.close();
                        s.close();
                    } catch (IOException ex) {
                        SwingUtilities.invokeLater(() -> txa.append("發生了" + ex + "例外\n"));
                    }
                }).start();
            }
        };

        connBtn.addActionListener(actLis); // 為連線按鈕添加動作監聽器

        // 將元件添加到伺服器面板
        serverPne.add(txa); // 將文字區域添加到面板
        serverPne1.add(connBtn); // 將連線按鈕添加到面板

        // 將面板添加到伺服器視窗
        frm.add(serverPne, BorderLayout.NORTH);
        frm.add(serverPne1, BorderLayout.SOUTH);

        // 設定視窗屬性
        frm.setSize(320, 240);
        frm.setVisible(true);
        frm.setLocation(50, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 建立客戶端的 GUI 視窗
        JFrame frm1 = new JFrame("客戶端");
        byte clientbuff[] = new byte[1024]; // 客戶端用來讀取資料的緩衝區

        // 建立一個 BorderLayout 佈局的面板給客戶端
        JPanel clientPne = new JPanel(new BorderLayout());
        clientPne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 建立一個預設文字為 "pchome.com.tw" 的文字輸入框
        JTextField txf = new JTextField("pchome.com.tw");
        txf.setPreferredSize(new Dimension(25, 25));

        // 建立不可編輯的文字區域來顯示訊息
        JTextArea txa1 = new JTextArea("", 8, 8);
        txa1.setEditable(false);

        // 建立一個 FlowLayout 佈局的面板和一個連線與傳送按鈕
        JPanel clientPne1 = new JPanel(new FlowLayout());
        JButton connBtn1 = new JButton("連線+傳送");
        connBtn1.setPreferredSize(new Dimension(100, 35));

        // 定義客戶端連線與傳送按鈕的動作監聽器
        ActionListener actLis1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 開啟一個新執行緒來處理客戶端操作
                new Thread(() -> {
                    try {
                        txa1.setText(""); // 清空文字區域
                        SwingUtilities.invokeLater(() -> txa1.append("正在與伺服端建立連線....\n"));

                        // 連線到本機的伺服器，埠號為 8080
                        Socket s = new Socket("127.0.0.1", 8080);
                        SwingUtilities.invokeLater(() -> txa1.append("已經與伺服端取得連線.....\n"));

                        // 取得輸出流以傳送資料到伺服器
                        OutputStream out = s.getOutputStream();
                        String str = txf.getText(); // 從輸入框取得文字
                        out.write(str.getBytes()); // 將資料傳送到伺服器
                        SwingUtilities.invokeLater(() -> txa1.append("傳送" + str + "到伺服端\n"));

                        // 取得輸入流以接收來自伺服器的資料
                        InputStream in = s.getInputStream();
                        int n = in.read(clientbuff); // 將資料讀入緩衝區
                        SwingUtilities.invokeLater(() -> txa1.append("從伺服器端收到："));
                        SwingUtilities.invokeLater(() -> txa1.append(new String(clientbuff, 0, n) + "\n")); // 顯示收到的資料

                        out.flush(); // 清空輸出流

                        // 關閉資源
                        in.close();
                        s.close();
                    } catch (Exception ex) {
                        SwingUtilities.invokeLater(() -> txa1.append("發生了" + ex + "例外\n"));
                    }
                }).start();
            }
        };

        connBtn1.addActionListener(actLis1); // 為連線與傳送按鈕添加動作監聽器

        // 將元件添加到客戶端面板
        clientPne.add(txa1); // 將文字區域添加到面板
        clientPne1.add(connBtn1); // 將連線與傳送按鈕添加到面板

        // 將元件添加到客戶端視窗
        frm1.add(txf, BorderLayout.NORTH); // 將文字輸入框添加到頂部
        frm1.add(clientPne, BorderLayout.CENTER); // 將文字區域添加到中心
        frm1.add(clientPne1, BorderLayout.SOUTH); // 將按鈕添加到底部

        // 設定視窗屬性
        frm1.setSize(320, 240);
        frm1.setVisible(true);
        frm1.setLocation(400, 100);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
