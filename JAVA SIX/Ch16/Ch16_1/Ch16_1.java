//Ch16_1 , 簡單的範例
package Ch16.Ch16_1;

import java.util.*;

public class Ch16_1 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Monkey"); // 增加元素
        hset.add("Bunny"); // 增加元素
        hset.add("Monkey"); // 增加元素

        System.out.println("HaseSet內容:" + hset);

    }
}
