//Ex14_4 讀取donkey.txt檔案並印出來且計算字元數
//Ex14_5 將"我有一隻小毛驢"這行省略掉
package Exam.Ex14.Ex14_4;

import java.io.FileReader;
import java.io.IOException;

public class Ex14_4 {
    public static void main(String[] args) throws IOException {
        // 創建一個字元陣列來儲存讀取的內容
        char data[] = new char[128];

        // 使用 FileReader 來讀取指定路徑的檔案
        FileReader fr = new FileReader("C:/Users/mmx/Desktop/JAVA SIX/Exam/Ex14/Ex14_4/donkey.txt");

        // 省略 "我有一隻小毛驢" 這一行 (Ex14_5 題目要求)
        // fr.skip(14);

        // 讀取檔案內容到字元陣列中，返回實際讀取的字元數
        int num = fr.read(data);

        // 將讀取的字元數據轉換成字串
        String str = new String(data, 0, num);

        // 輸出檔案的字元數和內容
        System.out.println("file size = " + num + " characters");
        System.out.println(str);

        // 關閉 FileReader 以釋放資源
        fr.close();
    }
}