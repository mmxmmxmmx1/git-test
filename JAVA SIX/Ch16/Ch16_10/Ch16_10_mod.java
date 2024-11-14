//Ch16_10 修改無意義的str=" ";並把Str改到while之前
package Ch16.Ch16_10;

import java.util.*;

public class Ch16_10_mod {
    public static void main(String[] args) {
        TreeSet<String> Tset = new TreeSet<>();

        Tset.add("Monkey"); // 增加元素
        Tset.add("Bunny"); // 增加元素
        Tset.add("Puppy"); // 增加元素
        Tset.add("Kitty"); // 增加元素

        Iterator<String> itr = Tset.iterator(); // 取得Iterator物件
        System.out.print("TreeSet內容:");

        String str = null; // 用來記錄最後一個元素

        while (itr.hasNext()) { // 走訪元素
            str = itr.next(); // 直接取得當前元素
            System.out.print(str + " "); // 印出元素內容
        }

        System.out.println("\n刪除最後讀取的元素" + str + "...");
        itr.remove(); // 刪除最後讀取的元素
        System.out.println("TreeSet內容" + Tset);
    }
}