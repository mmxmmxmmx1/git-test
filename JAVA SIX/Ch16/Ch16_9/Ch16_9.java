//Ch16_9, 以for-each loop 走訪TreeSet 元素
package Ch16.Ch16_9;

import java.util.*;

public class Ch16_9 {
    public static void main(String[] args) {
        TreeSet<String> Tset = new TreeSet<String>();
        Tset.add("Monkey"); // 增加元素
        Tset.add("Bunny");
        Tset.add("Puppy");
        Tset.add("Kitty");
        System.out.print("TreeSet內容: ");

        for (String i : Tset) { // 走訪
            System.out.print(i + " ");
        }
    }
}
