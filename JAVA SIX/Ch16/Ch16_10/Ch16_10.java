package Ch16.Ch16_10;

import java.util.*;

public class Ch16_10 {
    public static void main(String[] args) {
        TreeSet<String> Tset = new TreeSet<String>();
        String str = "";
        Tset.add("Monkey"); // 增加元素
        Tset.add("Bunny"); // 增加元素
        Tset.add("Puppy"); // 增加元素
        Tset.add("Kitty"); // 增加元素

        Iterator<String> itr = Tset.iterator(); // 取得Interator物件
        System.out.print("TreeSet內容:");
        while (itr.hasNext()) { // 走訪元素
            str = itr.next();
            System.out.print(str + " "); // 印出元素內容
        }

        System.out.println("\n刪除最後讀取的元素" + str + "...");
        itr.remove(); // 刪除最後讀取的元素
        System.out.println("TreeSet內容" + Tset);
    }
}
