//Ch18_1 , 取得本機的名稱與IP位置
package Ch18.Ch18_1;

import java.net.*;

public class Ch18_1 {
    public static void main(String[] args) {
        try{
            InetAddress adr = InetAddress.getLocalHost();
            System.out.println(adr.getHostAddress());
            System.out.println(adr.getHostName());
            System.out.println(adr);
        }catch(UnknownHostException e){     //捕捉由InetAddress()拋出的例外
            System.out.println("無法取得IP位置");
        }
    }
}
