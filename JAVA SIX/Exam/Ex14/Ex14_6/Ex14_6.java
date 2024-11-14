//Ex14_6 FileWriter 將字元寫入hello.txt中
//Ex14_7 hello.txt 後面加上Welcome! 字串,並印出內容
package Exam.Ex14.Ex14_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex14_6 {
    public static void main(String[] args) throws IOException {
        // 用於存儲從文件中讀取的每一行內容的變數
        String str;
        
        // 創建 FileWriter 時啟用附加模式 (第二個參數為 true)
        // 這樣可以保留文件中的現有內容並在末尾追加新內容
        FileWriter fw = new FileWriter("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Exam\\Ex14\\Ex14_6\\hello.txt", true);
        
        // 使用 FileReader 來讀取指定路徑的文件
        FileReader fr = new FileReader("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Exam\\Ex14\\Ex14_6\\hello.txt");
        
        // 將要寫入文件的字符存儲在字符陣列中
        char hi[] = { 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n' };
        
        // 將 FileWriter 包裝在 BufferedWriter 中以提高寫入效率
        BufferedWriter bfw = new BufferedWriter(fw);
        
        // 將 FileReader 包裝在 BufferedReader 中以提高讀取效率
        BufferedReader bfr = new BufferedReader(fr);
        
        // 逐行讀取文件內容並輸出到控制台
        while ((str = bfr.readLine()) != null) {
            System.out.println(str);
        }
        
        // 將字符陣列寫入文件末尾
        bfw.write(hi);
        
        // 強制將緩衝區中的內容寫入文件
        bfw.flush();
        
        // 關閉 BufferedReader 和 BufferedWriter 以釋放資源
        bfr.close();
        bfw.close();
    }
}