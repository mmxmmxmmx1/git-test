//14_11 chatgpt作法
package Exam.Ex14.Ex14_11;

import java.io.*;
import java.util.Random;

public class Ex14_11a {
    // 方法writerData用於生成100個隨機小寫英文字母並將它們寫入文件
    public void writerData() throws IOException {
        Random sum = new Random();
        // 使用try-with-resources語句自動管理FileOutputStream的資源
        try (FileOutputStream fo = new FileOutputStream("Exam/Ex14/Ex14_11/rand99.txt", true)) {
            for (int i = 0; i < 100; i++) {
                int random = sum.nextInt(26); // 生成一個0到25的隨機數
                char ch = (char) ('a' + random); // 將隨機數轉換成對應的字母
                fo.write(ch); // 將字母寫入文件
            }
            fo.flush(); // 確保所有數據都已經寫入文件
        }
    }

    // 方法cnt用於計數文件中各母音字母出現的次數
    public void cnt() throws IOException {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        // 使用try-with-resources語句自動管理FileInputStream的資源
        try (FileInputStream fi = new FileInputStream("Exam/Ex14/Ex14_11/rand99.txt")) {
            byte[] ba = new byte[fi.available()]; // 創建一個大小為文件內容長度的字節數組
            fi.read(ba); // 讀取文件內容到字節數組中
            for (byte b : ba) { // 遍歷字節數組
                switch (b) { // 根據字節值決定增加哪個母音的計數
                    case 'a':
                        sum1++;
                        break;
                    case 'e':
                        sum2++;
                        break;
                    case 'i':
                        sum3++;
                        break;
                    case 'o':
                        sum4++;
                        break;
                    case 'u':
                        sum5++;
                        break;
                }
            }
        }
        // 打印每個母音字母的出現次數
        System.out.println("a出現了:" + sum1);
        System.out.println("e出現了:" + sum2);
        System.out.println("i出現了:" + sum3);
        System.out.println("o出現了:" + sum4);
        System.out.println("u出現了:" + sum5);
    }

    public static void main(String[] args) {
        try {
            Ex14_11 ex = new Ex14_11(); // 創建Ex14_11類的實例
            ex.writerData(); // 調用writerData方法寫數據到文件
            ex.cnt(); // 調用cnt方法計數母音字母
        } catch (IOException e) {
            e.printStackTrace(); // 打印異常信息
        }
    }
}
