//Ch13_10 , 撰寫try-catch 區塊來捕捉IOException 例外
package Ch13.Ch13_10;

import java.io.*;

public class Ch13_10 {
    public static void main(String[] args) {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input a string: ");
            str = buf.readLine();
            System.out.println("string= " + str); // 印出字串
        } catch (IOException e) {
        }
    }
}
