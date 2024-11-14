//Ch14.1 讀取檔案內容 自己修改版本
package Ch14.Ch14_1;

import java.io.FileReader;
import java.io.IOException;

public class Ch14_1 {
    public static void main(String[] args) throws IOException {
        char data[] = new char[128];
        FileReader fr = new FileReader("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Ch14\\Ch14_1\\Ch14_1a.txt");
        int num = fr.read(data);
        String str = new String(data, 0, num);
        System.out.println("總字數共有: " + num + " 個字");
        System.out.println("txt文字檔的內容為:\n" + str);
        fr.close();
    }
}
