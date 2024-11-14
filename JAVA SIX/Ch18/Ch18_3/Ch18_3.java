//Ch18_3 , 使用URL類別
package Ch18.Ch18_3;

import java.net.*;

public class Ch18_3 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://udn.com/new/index");
            System.out.println("通訊協定名稱為 " + u.getProtocol());
            System.out.println("host name為 " + u.getHost());
            System.out.println("port為 " + u.getPort());
            System.out.println("檔名為 " + u.getFile());
        } catch (MalformedURLException e) {
            System.out.println("發生了" + e + "例外");
        }
    }
}
