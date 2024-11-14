//Ch_5 , 使用URLConnection類別
package Ch18.Ch18_5;

import java.net.*;
import java.io.*;

public class Ch18_5 {
    public static void main(String[] args) {
        try {
            URL u1 = new URL("http://www.hinet.net");
            URL u2 = Ch18_5.class.getResource("poem.txt");
            URL u3 = Ch18_5.class.getResource("pic0.png");

            URLConnection uc1 = u1.openConnection();
            URLConnection uc2 = u2.openConnection();
            URLConnection uc3 = u3.openConnection();

            System.out.println("主網頁的大小為 " + uc1.getContentLength());
            System.out.println("，類型為 " + uc1.getContentType());
            System.out.println("Poem.txt大小為 " + uc2.getContentLength());
            System.out.println("， 類行為 " + uc2.getContentType());
            System.out.println("pic0.jpg的大小為 " + uc3.getContentLength());
            System.out.println("， 類行為 " + uc3.getContentType());
        } catch (IOException e) {
            System.out.println("發生了" + e + "例外");
        }
    }
}
