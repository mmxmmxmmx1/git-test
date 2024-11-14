package Ch14.Ch14_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ch14_3 {
    public static void main(String[] args) throws IOException {
        String str;
        int count = 0;
        FileReader fr = new FileReader("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Ch14\\Ch14_3\\number.txt");
        BufferedReader brf = new BufferedReader(fr);

        while ((str = brf.readLine()) != null) {             //每次讀取一行，直到檔案結束
            count++;                                         //計算讀取的行數
            System.out.println(str);
        }
        System.out.println(count + " lines read");
        fr.close();                                         //關閉檔案
        brf.close();
    }
}
