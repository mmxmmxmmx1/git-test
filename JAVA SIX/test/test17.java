/*
試以 FileInputStream 與 FileOutputStream 類別撰寫程式，並依照下列的步驟完成：
(a) 試產生 1000 個 1~99999 之間的整數亂數，將亂數寫入 "rand.txt" 檔案內。
(b) 讀取 rand.txt 的內容，並找出這 1000 個數值的平均值、最大值與最小值。
(c) 讀取 rand.txt 的內容，並對這 1000 個數值由小排到大，並將結果寫到 rand2.txt。
(提示：本題需要用到String 類別裡的split()函數，關於split()的方法，可參考JAVA的參考文件) 
*/
package test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test17 {
    public static void main(String[] args) throws IOException {
        try {
            int max = 0;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            BufferedWriter bfw = new BufferedWriter(new FileWriter("test/rand.txt"));
            FileReader fr = new FileReader("test/rand.txt");
            for (int i = 0; i < 1000; i++) {
                int num = (int) (Math.random() * 99999);
                sum += num;
                bfw.write(num + "\n");
                fr.read();
                for (int j = 0; j < 1000; j++) {
                    if (num > max) {
                        max = num;
                    } else if (num < min) {
                        min = num;
                    }
                }
            }
            System.out.println("最大值為：" + max);
            System.out.println("最小值為：" + min);
            System.out.println("平均值為：" + (double) sum / 1000);
            fr.close();
            bfw.flush();
            bfw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}