//Ch18_2 , 取得指定主機 (例如 udn.com) 的名稱與 IP 位址
package Ch18.Ch18_2;

import java.net.*;

public class Ch18_2 {
    public static void main(String[] args) {
        try{
            InetAddress adr;
            adr=InetAddress.getByName("udn.com"); //取得IP位置
            System.out.println(adr);
        }catch(UnknownHostException e){
            System.out.println("無法取得IP位址");
        }
    }
}
