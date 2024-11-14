package Exam.Ex14.Ex14_9;

import java.io.*;

public class Ex14_9 {
    public static void main(String[] args) throws IOException {
        // 定義字符串變數來存儲文件內容
        String str1, str2, str3;

        // 創建文件讀取器來讀取aaa.txt文件
        FileReader fr1 = new FileReader("/home/mmx/桌面/JAVA SIX/Exam/Ex14/Ex14_9/aaa.txt");
        BufferedReader bfr1 = new BufferedReader(fr1);

        // 創建文件讀取器來讀取bbb.txt文件
        FileReader fr2 = new FileReader("/home/mmx/桌面/JAVA SIX/Exam/Ex14/Ex14_9/bbb.txt");
        BufferedReader bfr2 = new BufferedReader(fr2);

        // 創建文件寫入器來寫入ccc.txt文件
        FileWriter fw = new FileWriter("/home/mmx/桌面/JAVA SIX/Exam/Ex14/Ex14_9/ccc.txt");
        BufferedWriter bfw = new BufferedWriter(fw);

        // 讀取aaa.txt文件的第一行並打印
        str1 = bfr1.readLine();
        System.out.println(str1);

        // 讀取bbb.txt文件的第一行並打印
        str2 = bfr2.readLine();
        System.out.println(str2);

        // 將兩個文件的內容合併
        str3 = str1 + "\n" + str2;

        // 將合併後的內容寫入ccc.txt文件並打印
        bfw.write(str3);
        System.out.println(str3);

        // 刷新並關閉BufferedWriter
        bfw.flush();
        bfw.close();

        // 關閉BufferedReader
        bfr1.close();
        bfr2.close();
    }
}
