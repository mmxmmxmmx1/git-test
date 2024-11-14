package Ch14.Ch14_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ch14_4 {
    public static void main(String[] args) throws IOException {
        // 創建一個 FileWriter 實例，用於寫入文件
        FileWriter fw = new FileWriter("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Ch14\\Ch14_4\\random.txt");

        // 創建一個 BufferedWriter 實例，用於為 FileWriter 提供緩衝功能
        BufferedWriter bfw = new BufferedWriter(fw);

        // 使用 for 迴圈寫入四行隨機數到文件中
        for (int i = 1; i < 5; i++) {
            // 將隨機數轉換為字符串並寫入文件
            bfw.write(Double.toString(Math.random()));
            // 寫入一個新行符號，將每個隨機數寫在不同的行
            bfw.newLine();
        }

        // 關閉 BufferedWriter，確保所有數據都被寫入文件
        bfw.flush();
        // 關閉 FileWriter，釋放系統資源
        fw.close();
    }
}
