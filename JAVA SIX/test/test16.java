//建立writeData()函數來寫100個亂數的a到z,並存入rand99.txt檔案,並用cnt()函數計算出當中'a','e','i','o','u'的個數，並顯示出來
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class test16 {
    public void writeData() throws IOException {
        Random random = new Random();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("test/rand99.txt"));
        for (int i = 0; i < 100; i++) {
            int sum = random.nextInt(26);
            char ch = (char) ('a' + sum);
            bfw.write(ch);
        }
        bfw.newLine(); // 在所有字符後添加一個新行
        bfw.flush();
        bfw.close();
    }

    public void cnt() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("test/rand99.txt"));
        String line;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        while ((line = bfr.readLine()) != null) {
            if (line.equals("a")) {
                a++;
            } else if (line.equals("e")) {
                e++;
            } else if (line.equals("i")) {
                i++;
            } else if (line.equals("o")) {
                o++;
            } else if (line.equals("u")) {
                u++;
            }
        }
        System.out.println("a=" + a + "\ne=" + e + "\ni=" + i + "\no=" + o + "\nu=" + u);
        bfr.close();
    }

    public static void main(String[] args) {
        try {
            test16 test = new test16();
            test.writeData();
            test.cnt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
