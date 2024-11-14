//Ch14_2 用FileWriter寫入 .txt的檔案
package Ch14.Ch14_2;

import java.io.FileWriter;
import java.io.IOException;

public class Ch14_2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\mmx\\Desktop\\JAVA SIX\\Ch14\\Ch14_2\\proverb.txt");
        char data[] = { '火', '車', '快', '飛', '，', '火', '車', '快', '飛', '\n' };
        String str = ("越過高山，飛過小溪\n不知走了幾百里");
        fw.write(data);
        fw.write(str);
        fw.close();
    }
}
