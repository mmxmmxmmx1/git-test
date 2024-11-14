//Ex14_8 ,建立proverb.txt 利用BufferedReader 讀取proverb.txt 內容
package Exam.Ex14.Ex14_8;

import java.io.*;

public class Ex14_8 {
    public static void main(String[] args) throws IOException {
        // 宣告一個字串變數用來儲存讀取的每一行
        String str;

        // 建立 FileReader 物件，指定要讀取的檔案路徑
        FileReader fr = new FileReader("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Exam\\Ex14\\Ex14_8\\proverb.txt");

        // 利用 BufferedReader 包裝 FileReader，以提高讀取效能
        BufferedReader bfr = new BufferedReader(fr);

        // 跳過檔案前 35 個字元
        fr.skip(35);

        // 使用 while 迴圈逐行讀取檔案內容，直到讀取完畢
        while ((str = bfr.readLine()) != null) {
            // 輸出讀取的每一行字串
            System.out.println(str);
        }
        // 關閉 BufferedReader 以釋放相關資源
        bfr.close();
    }
}
